package com.gmibank.stepdefinitions;

import com.gmibank.pojos.CustomerObject;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.ReadTxt;
import com.gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import io.restassured.response.*;
import io.restassured.http.ContentType;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BirinciApiSepDefinitions {

    Response response;
    String filePath = "src/test/resources/testdata/AllCustomerDatas.txt";
    CustomerObject[] customer;

    @Given("User provides the api end point to set the response using {string} {string}")
    public void userProvidesTheApiEndPointToSetTheResponseUsing(String endpoint, String bearerToken) {
        Map<String, Object> mapForToken = new HashMap<>();
        mapForToken.put("username", "");
        mapForToken.put("password", "");
        mapForToken.put("rememberMe", false);
        response = (Response) given().headers("Content=Type", ContentType.JSON, "Accept", ContentType.JSON)
                .when().body(mapForToken)
                .post("https://gmibank-qa-environment.com/api/authenticate")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

        response = given().headers("Authorization", "Bearer" + ConfigurationReader.getProperty(bearerToken),
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                .param("size", 1500)//.auth().oauth2(ConfigurationReader.getProperty(bearerToken))
                .when()
                .get(ConfigurationReader.getProperty(endpoint))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    @And("All customer info will be set to customers with deserialization")
    public void allCustomerInfoWillBeSetToCustomersWithDeserialization() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        customer = obj.readValue(response.asString(), CustomerObject[].class);
        System.out.println(customer[0].getFirstName() + "\n" + customer[0].getLastName());
        System.out.println(customer[1].getFirstName() + "\n" + customer[1].getLastName());

        // NUll olan country haric countryleri alalim
        for (int i = 1; i < customer.length; i++) {
            if (customer[i].getCountry() != null) {
                System.out.println(customer[i].getCountry().getName());
            }
            // butun firstnameleri ornegin alalim
            for (int j = 1; j < customer.length; j++) {
                System.out.println(customer[j].getFirstName());

            }
        }
    }

        @Then("All customer info will be saved to txt files")
        public void allCustomerInfoWillBeSavedToTxtFiles () {
            WriteToTxt.saveAllCustomerData(filePath, customer);
        }

        // Burada farkli olarak UI dan ya da API`den olusturdugumuz customerin SSNini kontrol daha saglikli olacaktir
        @Then("All customer info has been validated")
        public void allCustomerInfoHasBeenValidated () {
            List<String> actualSssn = ReadTxt.returnCustomerSNNList2(filePath);
            List<String> expectedList = new ArrayList<>();
            expectedList.add("348-27-5269");
            expectedList.add("716-17-4100");
            expectedList.add("890-40-8248");

            Assert.assertTrue("Ssn`ler eslesmiyor", actualSssn.containsAll(expectedList));
        }



}