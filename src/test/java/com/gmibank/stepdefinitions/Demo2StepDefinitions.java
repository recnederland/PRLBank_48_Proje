package com.gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmibank.jsonmodels.CountryJson;
import com.gmibank.pojos.Country2;
import com.gmibank.pojos.Customer2;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.DatabaseUtility;
import com.gmibank.utilities.PDFGenerator2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import io.cucumber.junit.CucumberOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.gmibank.utilities.DatabaseUtility2.getQueryResultList;

public class Demo2StepDefinitions {
    Response response;
    Response responseAll;
    JsonPath jsonPath;
    Country2[] country2;
    List<Country2> dbCountry2 = new ArrayList<>();
    List<Object> userEmailList;

    @Given("User on the api endpoint {string} and read the countries")
    public void api_end_point(String url) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)

                .extract()
                .response();
        response.prettyPrint();
    }

    List<Integer> idlistesi = new ArrayList<>();

    @Given("Validate countries read")
    public void validate_edelim() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        country2 = objectMapper.readValue(response.asString(), Country2[].class);
        System.out.println("ilk name okunuyor dikkat ");
        System.out.println("ilk name ");
        System.out.println(country2[0].getName());
        System.out.println("id listesi geliyor ");
        System.out.println();
        for (int i = 0; i < country2.length; i++) {
            idlistesi.add(country2[i].getId());
            System.out.println("id  :" + country2[i].getId());
        }
        JsonPath jsonPath = response.jsonPath();
        String countryId = jsonPath.getString("id");
        Assert.assertTrue("bulunamadi ", countryId.contains("74418"));
        //    WriteToTxt.saveDataInFileWithid("id.txt", country);
        //   List<String> readId = ReadTxt.returnCustomerSNNList("id.txt");
        //   Assert.assertEquals("sorun var ",idlistesi,readId);
        // System.out.println("hersey basarili ");
    }

    // Create Country
    @Given("create a country using to api end point {string}")
    public void create_a_country_using_to_api_end_point(String url) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(CountryJson.createCountry)
                .post(ConfigurationReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    // Validate Created  Country and  Database
    @Given("creates a connection with db using {string} , {string} and {string}")
    public void creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(ConfigurationReader.getProperty(url), ConfigurationReader.getProperty(username), ConfigurationReader.getProperty(password));
    }

    @Given("user provides the query {string} and {string}")
    public void user_provides_the_query_and(String query, String column) {
        List<Object> list = DatabaseUtility.getColumnData(query, column);
        Country2[] countries1 = new Country2[list.size()];
        for (int i = 0; i < list.size() - 1; i++) {
            Country2 country2 = new Country2();
            country2.setId(Integer.parseInt(list.get(i).toString().trim()));
            dbCountry2.add(country2);
            System.out.println(dbCountry2.get(i).getId());
        }
    }

    @Then("validate created country with {int}")
    public void validate_created_country_with(Integer id) {
        List<Integer> database = new ArrayList<>();
        for (int i = 0; i < dbCountry2.size(); i++) {
            database.add(dbCountry2.get(i).getId());
        }
        System.out.println("=================================");
        System.out.println();
        Assert.assertTrue(database.contains(id));
        System.out.println("basardik ");
    }

    @Given("user updates a country using api end point {string}  {string} and its extension {string}")
    public void user_updates_a_country_using_api_end_point_and_its_extension(String url, String name, String id) {
        Map<String, Object> updateInfos = new HashMap<>();
        updateInfos.put("id", "22320");
        updateInfos.put("name", "Team30's Country");
        updateInfos.put("states", null);
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(updateInfos)
                .put(ConfigurationReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String url, String id) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(ConfigurationReader.getProperty(url) + id)
                .then()
                .extract()
                .response();

        response.prettyPrint();
        responseAll = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = responseAll.jsonPath();
        String remainingIds = jsonPath.getString("id");
        System.out.println("***********************************************");
        Assert.assertFalse("silinmedi haberin olsun ", remainingIds.contains(id));
        System.out.println("-------------------------");
        System.out.println("islem tamam ");
    }

    @Given("User creates a connection with db using {string} , {string} and {string}")
    public void demo_pdf_user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(ConfigurationReader.getProperty(url), ConfigurationReader.getProperty(username), ConfigurationReader.getProperty(password));
    }
    @Given("User retrieves the info of user from database using {string} and {string}")
    public void userRetrievesTheInfoOfUserFromDatabaseUsingAnd(String query, String userEmail) {
        userEmailList = DatabaseUtility.getColumnData(query,userEmail);
        System.out.println(userEmailList);
    }

    @Given("User validates users info {string}")
    public void user_validates_users_info(String email) {
        Assert.assertTrue(userEmailList.contains(ConfigurationReader.getProperty(email)));
        System.out.println("Test passed");
    }

    @Given("User provides the query {string} and generate it to PDF")
    public void demo_pdf_user_provides_the_query(String query) {
        List<Customer2> customer2s = new ArrayList<>();
        List<List<Object>> list = getQueryResultList(query);
        for (int i = 0; i <= 5; i++) {
            Customer2 customer2 = new Customer2();
            customer2.setFirstName(list.get(i).get(1).toString());
            customer2.setLastName(list.get(i).get(2).toString());
            customer2.setMobilePhoneNumber(list.get(i).get(5).toString());
            //      customer.setCity(list.get(i).get(9).toString());
            customer2.setSsn(list.get(i).get(10).toString());
            customer2s.add(customer2);
        }
        PDFGenerator2.pdfGeneratorRowsAndCellsWithListFirstToFive("           Team 30 THE BUG FINDERS DEMO PRESENTATION\n                                                      === First datas  ===", customer2s, "team30.pdf");

    }


    @And("Validate country create")
    public void validateCountryCreate() {
    }

    @And("Validate country update")
    public void validateCountryUpdate() {
    }

    @And("Validate country delete")
    public void validateCountryDelete() {
    }
}