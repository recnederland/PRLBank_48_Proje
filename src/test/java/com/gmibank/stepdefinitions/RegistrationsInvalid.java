package com.gmibank.stepdefinitions;

import com.gmibank.pages.RegistrationAndHomePage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegistrationsInvalid {

    RegistrationAndHomePage regis = new RegistrationAndHomePage();
    Faker faker = new Faker();
    String password = faker.internet().password(10, 15, true, true);

    @And("User provides a ssn {string}")
    public void userProvidesASsn(String ssn) {
        regis.ssnTextBox.sendKeys(ssn);
    }

    @And("User provides a firstname {string} and a lastname {string}")
    public void userProvidesAFirstnameAndALastname(String firstname, String lastname) {
        regis.firstNameTextBox.sendKeys(firstname);
        regis.lastNameTextBox.sendKeys(lastname);
    }

    @And("User provides a adress {string}")
    public void userProvidesAAdress(String address) {
        regis.addressTextBox.sendKeys(address);
    }

    @And("User provides a mobile phone number {string}")
    public void userProvidesAMobilePhoneNumber(String mobilePhoneNumber) {
        regis.mobilePhoneNumberTextBox.sendKeys(mobilePhoneNumber);
    }

    @And("User provides a username {string}")
    public void userProvidesAUsername(String username) {
        regis.userNameTextBox.sendKeys(username);
    }

    @And("User provides a email {string}")
    public void userProvidesAEmail(String email) {
        regis.emailTextBox.sendKeys(email);
    }

    @And("User provides a new password {string}")
    public void userProvidesANewPassword(String password) {
        regis.firstPasswordTextBox.sendKeys(password);
    }

    @And("User provides a new password confirmation {string}")
    public void userProvidesANewPasswordConfirmation(String secondPassword) {
        regis.secondPasswordTextBox.sendKeys(secondPassword);
    }

    @Then("User should see invalid-feedback error message")
    public void userShouldSeeInvalidFeedbackErrorMessage() throws InterruptedException {
        //Assert.assertFalse(regis.errormessage.isDisplayed());

        Thread.sleep(3000);
        Assert.assertTrue(regis.erroAllert.isDisplayed());
        Thread.sleep(3000);

    }


}
