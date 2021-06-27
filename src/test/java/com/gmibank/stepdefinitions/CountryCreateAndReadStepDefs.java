package com.gmibank.stepdefinitions;

import com.gmibank.utilities.DBUtils_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;
public class CountryCreateAndReadStepDefs {
    List<Object> actualCountryIds;
    String expectedId;
    @And("DUders user creates a Country data using {string} {string}")
    public void udersUserCreatesACountryDataUsing(String query, String id) {
        DBUtils_2.executeQueryOnly(query);
        expectedId = id;
    }
    @And("DUders user reads the Country data using {string} and {string}")
    public void udersUserReadsTheCountryDataUsingAnd(String query, String columnName) {
        actualCountryIds = DBUtils_2.getColumnData(query, columnName);
        System.out.println(actualCountryIds);
        System.out.println(actualCountryIds.size());
        DBUtils_2.closeConnection();
    }
    @Then("DUders validate customers data")
    public void udersValidateCustomersData() {
        Assert.assertTrue(actualCountryIds.toString().contains(expectedId));
    }
}