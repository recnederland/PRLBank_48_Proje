package com.gmibank.stepdefinitions;


import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginPageStepDefinition {

    LoginPage loginPage= new LoginPage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("User goes to home page {string}")
    public void userGoesToHomePage(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    @Given("User clicks login icon")
    public void userClicksLoginIcon() {
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginDropdownIcon.click();

    }

    @And("User clicks Sign in button")
    public void userClicksSignInButton() {
        loginPage.signInButton.click();
    }

    @When("User enters valid credantials username {string} and password {string} on the pop-up page")
    public void userEntersValidCredantialsUsernameAndPasswordOnThePopUpPage(String username, String password) {
        loginPage.UserNameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
    }

    @And("User clicks signin button on the pop-up page")
    public void userClicksSigninButtonOnThePopUpPage() {
        loginPage.popupPageSignInButton.click();
    }

    @Then("User should login")
    public void userShouldLogin() {
        Assert.assertTrue(loginPage.myOperationsIcon.isDisplayed());
    }


    @And("User clicks cancel button")
    public void userClicksCancelButton() throws InterruptedException {
        loginPage.cancelButton.click();
        // Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Then("User should return to home page")
    public void userShouldReturnToHomePage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://gmibank-qa-environment.com/";
        Assert.assertEquals(expectedUrl , actualUrl);

    }

    @When("User enters   credantials username {string} and password {string} on the pop-up page")
    public void userEntersCredantialsUsernameAndPasswordOnThePopUpPage(String username1, String password1) {
        loginPage.UserNameBox.sendKeys(username1);
        loginPage.passwordBox.sendKeys(password1);
    }

    @When("User enters invalid  credantials {string} and {string} on the pop-up page")
    public void userEntersInvalidCredantialsAndOnThePopUpPage(String usernameinvalid, String passwordinvalid) throws InterruptedException {
        loginPage.UserNameBox.sendKeys(usernameinvalid);
        loginPage.passwordBox.sendKeys(passwordinvalid);
        Thread.sleep(2000);
    }

    @Then("Shouldt not be able to login and should be seen error msg")
    public void shouldtNotBeAbleToLoginAndShouldBeSeenErrorMsg() {
        String actualmsg=loginPage.loginErrormsg.getText();
        String acceptedmsg="Failed to sign in! Please check your credentials and try again.";
        Assert.assertEquals(acceptedmsg , actualmsg);




    }
}
