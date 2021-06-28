package com.gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmibank.pojos.CountryObject;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.ReadTxt;
import com.gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IkinciAPIStepDefinitions {

    CountryObject[] country;
    Response response;
    Response responseGet;
    String bearerToken = ConfigurationReader.getProperty("api_bearer_token");
    int expectedId;
    String filePath = "src/test/resources/testdata/AllCountryIds.txt";
    String filePath2 = "src/test/resources/testdata/AllCountryIdsAfterDelete.txt";
    @And("User creates a country from api using {string}d")
    public void userCreatesACountryFromApiUsingD(String endPoint) throws IOException {
        Map<String, Object> createEdilecekCountry = new HashMap<>();
        createEdilecekCountry.put("name", "Gambiya");
        createEdilecekCountry.put("states", null);
        response = RestAssured.
                given().
                headers("Authorization", "Bearer " + bearerToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(createEdilecekCountry)
                .post(ConfigurationReader.getProperty(endPoint));
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        expectedId = jsonPath.getInt("id");
        System.out.println(expectedId);
    }
    @Then("User validates that country is created")
    public void userValidatesThatCountryIsCreated() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        responseGet = RestAssured.given().headers("Authorization", "Bearer " + bearerToken,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when().contentType(ContentType.JSON)
                .get("https://gmibank-qa-environment.com/api/tp-countries")
                .then()
                .extract()
                .response();
        //responseGet.prettyPrint();
        country = objectMapper.readValue(responseGet.asString(), CountryObject[].class);
//        for (int i = 0; i < country.length; i++) {
//            System.out.println(country[i].getName());
//        }
        File file = new File(filePath);
        if (file != null) {
            file.delete();
        }
        WriteToTxt.saveDataInFileWithCountryid(filePath, country);
        List<String> actualCountryIds = ReadTxt.returnCountryIdList(filePath);
        Assert.assertTrue(actualCountryIds.contains(expectedId+""));
    }
    int updateId;
    @And("ders update created country using api end point {string}d")
    public void dersUpdateCreatedCountryUsingApiEndPointD(String endPoint) {
        updateId = 4499;
        Map<String, Object> expectedCountry = new HashMap<>();
        expectedCountry.put("id", updateId);
        expectedCountry.put("name", "Bosnia");
        expectedCountry.put("states", null);
        response = RestAssured.
                given().
                headers("Authorization", "Bearer " + bearerToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(expectedCountry)
                .put(ConfigurationReader.getProperty(endPoint));
        response.prettyPrint();
    }
    @Then("User validates that country is updated")
    public void userValidatesThatCountryIsUpdated() {
        responseGet = RestAssured.given().headers("Authorization", "Bearer " + bearerToken,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when().contentType(ContentType.JSON)
                .get("https://gmibank-qa-environment.com/api/tp-countries" + updateId)
                .then()
                .extract()
                .response();
        JsonPath json = response.jsonPath();
        String actualName = json.getString("name");
        Assert.assertEquals("Bosnia", actualName);
    }
    @And("ders delete created country using api end point {string} {string}d")
    public void dersDeleteCreatedCountryUsingApiEndPointD(String endPoint, String id) {
        response = RestAssured.
                given().
                headers("Authorization", "Bearer " + bearerToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .delete(ConfigurationReader.getProperty(endPoint) + id);
    }
    @Then("User validates that country is deleted")
    public void userValidatesThatCountryIsDeleted() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        responseGet = RestAssured.given().headers("Authorization", "Bearer " + bearerToken,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when().contentType(ContentType.JSON)
                .get("https://gmibank-qa-environment.com/api/tp-countries")
                .then()
                .extract()
                .response();
        //responseGet.prettyPrint();
        country = objectMapper.readValue(responseGet.asString(), CountryObject[].class);
//        for (int i = 0; i < country.length; i++) {
//            System.out.println(country[i].getName());
//        }
        File file = new File(filePath);
        if (file != null) {
            file.delete();
        }
        WriteToTxt.saveDataInFileWithCountryid(filePath2, country);
        List<String> actualCountryIds = ReadTxt.returnCountryIdList(filePath2);
        Assert.assertFalse(actualCountryIds.contains("4499"));
    }
}
