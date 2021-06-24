package com.gmibank.stepdefinitions;


import com.gmibank.pages.RegistrationAndHomePage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class RegistrationStepDefitnitions {

    //    ChromeDriver driver = new ChromeDriver();
    Faker faker = new Faker();
    String ssN = faker.idNumber().ssnValid();

    RegistrationAndHomePage regiser = new RegistrationAndHomePage();

    String password = faker.internet().password(10, 15, true, true);

    @Given("User on the {string}")
    public void userOnThe(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    @And("User navigates to registration page")
    public void userNavigatesToRegistrationPage() throws InterruptedException {
        Thread.sleep(1000);
        regiser.iconButton.click();
        regiser.registerButtonHomePage.click();
    }

    @Then("User provides a valid ssn")
    public void userProvidesAValidSsn() throws InterruptedException {
        Thread.sleep(1000);
        regiser.ssnTextBox.sendKeys("259-65-4598");
    }

    @And("User provides a valid firstname")
    public void userProvidesAValidFirstname() throws InterruptedException {
        Thread.sleep(1000);
        regiser.firstNameTextBox.sendKeys(faker.name().firstName());
    }

    @And("User provides a valid lastname")
    public void userProvidesAValidLastname() throws InterruptedException {
        Thread.sleep(1000);
        regiser.lastNameTextBox.sendKeys(faker.name().lastName());
    }

    @And("User provides a valid address")
    public void userProvidesAValidAddress() throws InterruptedException {
        Thread.sleep(1000);
        regiser.addressTextBox.sendKeys(faker.address().fullAddress());
    }

    @And("User provides a valid phonenumber")
    public void userProvidesAValidPhonenumber() throws InterruptedException {
        Thread.sleep(1000);
        regiser.mobilePhoneNumberTextBox.sendKeys("524-964-8547");
    }

    @And("User provides a valid username")
    public void userProvidesAValidUsername() throws InterruptedException {
        Thread.sleep(1000);
        regiser.userNameTextBox.sendKeys("team48moneytransferaccount1"); // ebubekir.sahin
    }

    @And("User provides a valid email")
    public void userProvidesAValidEmail() throws InterruptedException {
        Thread.sleep(1000);
        regiser.emailTextBox.sendKeys(faker.name().firstName() + faker.name().lastName() + faker.number().digits(2) + "@gmail.com");
    }

    @And("User provides a valid password")
    public void userProvidesAValidPassword() throws InterruptedException {
        Thread.sleep(1000);
        regiser.firstPasswordTextBox.sendKeys("team48Money.");
    }

    @And("User provides a valid password confirmation")
    public void userProvidesAValidPasswordConfirmation() throws InterruptedException {
        Thread.sleep(1000);
        regiser.secondPasswordTextBox.sendKeys("team48Money.");
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        regiser.registerButtonRegistrationPage.click();
        Thread.sleep(1000);
    }

    @And("User asserts that he could register successfully")
    public void userAssertsThatHeCouldRegisterSuccessfully() {
        //Assert.assertTrue(uiders.successMessage.size()==2);
        Assert.assertTrue(regiser.successMessage2.isDisplayed());
    }


    @And("User provides a {string} and confirmation")
    public void userProvidesAAndConfirmation(String passwordTypes) {
        regiser.firstPasswordTextBox.sendKeys(passwordTypes);
    }

    @Then("Password Strength Bar should show {string}")
    public void passwordStrengthBarShouldShow(String strengthBar) {

        String actualStrength = regiser.passwordScore(strengthBar).getAttribute("style");
        String expected1 = "background-color: rgb(255, 0, 0);";
        String expected2 = "background-color: rgb(255, 153, 0);";
        String expected3 = "background-color: rgb(153, 255, 0);";
        String expected4 = "background-color: rgb(153, 255, 0);";
        String expected5 = "background-color: rgb(0, 255, 0);";

        if (strengthBar.equals("1")) {
            assertEquals(expected1, actualStrength);
            System.out.println("1");
        } else if (strengthBar.equals("2")) {
            assertEquals(expected2, actualStrength);
            System.out.println("2");
        } else if (strengthBar.equals("3")) {
            assertEquals(expected3, actualStrength);
            System.out.println("3");
        } else if (strengthBar.equals("4")) {
            assertEquals(expected4, actualStrength);
            System.out.println("4");
        } else if (strengthBar.equals("5")) {
            assertEquals(expected5, actualStrength);
            System.out.println("5");
        }
    }
}
