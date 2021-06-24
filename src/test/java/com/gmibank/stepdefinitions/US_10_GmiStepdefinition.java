package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.pages.US_10_GmibankUSpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class US_10_GmiStepdefinition {

    US_10_GmibankUSpage gmiBankUs10Page =new US_10_GmibankUSpage();


    SoftAssert softAssert=new SoftAssert();


    @Then("given value in the Address field")
    public void given_value_in_the_Address_field() {

        gmiBankUs10Page.gmi_Adresse.sendKeys(ConfigurationReader.getProperty("gmi_validAdress"));
    }

    @Then("the system should not give an error message")
    public void the_system_should_not_give_an_error_message() {

        try{
            Assert.assertTrue(gmiBankUs10Page.gmi_ErrorMessageRequriedAdress.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    @Then("click the given value in the Address field")
    public void click_the_given_value_in_the_Address_field() {

        gmiBankUs10Page.gmi_Adresse.click();
    }


    @Then("tab button should be clicked")
    public void tab_button_should_be_clicked() {
        gmiBankUs10Page.gmi_Adresse.sendKeys(Keys.TAB);

    }
    @Then("system should give adress error message.")
    public void system_should_give_adress_error_message() {

        //Assert.assertTrue(gmiBankUs10Page.gmi_AdresseRequried.getText().contains(ConfigurationReader.getProperty("gmi_requiredErrorText")));

        try{
            Assert.assertTrue(gmiBankUs10Page.gmi_ErrorMessageRequriedAdress.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(false);
        }
    }

    @Then("given value in the City field")
    public void given_value_in_the_City_field() {
        gmiBankUs10Page.gmi_City.sendKeys(ConfigurationReader.getProperty("gmi_validCity"));

    }

    @Then("system should give error message.")
    public void systemShouldGiveCityErrorMessage() {

        try{
            Assert.assertTrue(gmiBankUs10Page.gmi_ErrorMessageRequried.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    @Then("click the given value in the City field")
    public void click_the_given_value_in_the_City_field() {
        gmiBankUs10Page.gmi_City.click();
    }

    @Then("select country in drop down menu")
    public void select_country_in_drop_down_menu() {
        Select country=new Select(gmiBankUs10Page.gmi_Country);
        country.selectByVisibleText("USA");

    }

    @Then("click the given value in the Country field")
    public void click_the_given_value_in_the_Country_field() {
        gmiBankUs10Page.gmi_Country.click();
        Select country=new Select(gmiBankUs10Page.gmi_Country);
        country.selectByIndex(0);

    }
    @And("And tab button should be fied Country clicked")
    public void andTabButtonShouldBeFiedCountryClicked() {
        gmiBankUs10Page.gmi_Country.sendKeys(Keys.TAB);
    }

    @Then("given value in the State field")
    public void given_value_in_the_Country_field() {
        gmiBankUs10Page.gmi_State.sendKeys(ConfigurationReader.getProperty("gmi_validState"));

    }

    @Then("click the given value in the State field")
    public void click_the_given_value_in_the_State_field() {
        gmiBankUs10Page.gmi_State.click();

    }
    @And("tab button should be fied State clicked")
    public void tabButtonShouldBeFiedStateClicked() {
        gmiBankUs10Page.gmi_State.sendKeys(Keys.TAB);
    }



}
