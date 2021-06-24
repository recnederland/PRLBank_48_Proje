package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.pages.US_09_GmiBankUs09Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US_09_StepDefinition {

    US_09_GmiBankUs09Page gmiBankUs09Page=new US_09_GmiBankUs09Page();

    @And("click on  My Operations")
    public void clickOnMyOperations() {

        gmiBankUs09Page.gmi_MyOperationsSection.click();
    }

    @And("click on Manage Customers")
    public void clickOnManageCustomers() {
        gmiBankUs09Page.gmi_ManageCustomersSection.click();
    }

    @Then("click on Create a new Customer")
    public void click_on_Create_a_new_Customer() {
        gmiBankUs09Page.gmi_CreateNewCustomerButton.click();

    }
    @Then("given valid value in the ssn field")
    public void given_value_in_the_ssn_field() {
        gmiBankUs09Page.gmi_SsnField.sendKeys(ConfigurationReader.getProperty("gmi_ssnNumber"));

    }
    @And("given invalid value in the ssn field")
    public void givenInvalidValueInTheSsnField() {
        gmiBankUs09Page.gmi_SsnField.sendKeys(ConfigurationReader.getProperty("gmi_invalidSsnNumber"));
    }
    @And("wait {int} esconds")
    public void waitEsconds(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("click on search button")
    public void click_on_search_button() {
        gmiBankUs09Page.gmi_SearchButton.click();

    }

    @Then("verify that all information is displayed when search is clicked.")
    public void verifyThatAllInformationIsDisplayedWhenSearchIsClicked(List<String> data) {

        for (String str:data) {

            Assert.assertTrue(str.contains(gmiBankUs09Page.gmi_Firstname.getText()));
            Assert.assertTrue(str.contains(gmiBankUs09Page.gmi_Lastname.getText()));
            Assert.assertTrue(str.contains(gmiBankUs09Page.gmi_Ssn.getText()));
        }
    }
    @Then("verify that all information invalid is displayed when search is clicked.")
    public void verifyThatAllInformationInvalidIsDisplayedWhenSearchIsClicked() {

        Assert.assertTrue(gmiBankUs09Page.gmi_Firstname.getText().isEmpty());
        Assert.assertTrue(gmiBankUs09Page.gmi_Lastname.getText().isEmpty());
        Assert.assertTrue(gmiBankUs09Page.gmi_Ssn.getText().isEmpty());

    }

    @Then("verify that all information empty is displayed when search is clicked.")
    public void verifyThatAllInformationEmptyIsDisplayedWhenSearchIsClicked() {

        Assert.assertTrue(gmiBankUs09Page.gmi_Firstname.getText().isEmpty());
        Assert.assertTrue(gmiBankUs09Page.gmi_Lastname.getText().isEmpty());
        Assert.assertTrue(gmiBankUs09Page.gmi_Ssn.getText().isEmpty());

    }



}
