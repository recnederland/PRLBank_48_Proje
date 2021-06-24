package com.gmibank.stepdefinitions;

import com.gmibank.pages.LoginPage;
import com.gmibank.pages.RegistrationAndHomePage;
import com.gmibank.pages.RegistrationPage;
import com.gmibank.pages.US_016_MoneyTransferPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Sprint_01_Presentatie {

    RegistrationPage sprint = new RegistrationPage();
    LoginPage sprintLogin = new LoginPage();
    RegistrationAndHomePage sprintHomaPage = new RegistrationAndHomePage();
    US_016_MoneyTransferPage sprintOperation = new US_016_MoneyTransferPage();


    @And("Admin login his account")
    public void adminLoginHisAccount() {
        sprintLogin.loginDropdownIcon.click();
        Driver.wait(2);
        sprintLogin.signInButton.click();
        Driver.wait(2);
        sprintLogin.userNameTextBox.sendKeys(ConfigurationReader.getProperty("username_admin"));
        Driver.wait(2);
        sprintLogin.passwordBox.sendKeys(ConfigurationReader.getProperty("password_admin"));
        Driver.wait(2);
        sprintLogin.signInButton2.click();
        Driver.wait(2);

    }

    @And("Admin activate customer account")
    public void adminActivateCustomerAccount() {
        sprintLogin.administration.click();
        Driver.wait(2);
        sprintLogin.userManagement.click();
        Driver.wait(2);
        sprintLogin.createdDate.click();
        Driver.wait(2);
        sprintLogin.activatedButton.click();
        Driver.wait(2);



    }

    @And("Admin log-out his account")
    public void adminLogOutHisAccount() {
        sprintLogin.userSegment.click();
        Driver.wait(2);
        sprintLogin.signOutButton.click();
        Driver.wait(2);
    }

    @And("Employee login his account")
    public void employeeLoginHisAccount() {
        sprintLogin.loginDropdownIcon.click();
        Driver.wait(2);
        sprintLogin.signInButton.click();
        Driver.wait(2);
        sprintLogin.userNameTextBox.sendKeys(ConfigurationReader.getProperty("username_employee"));
        Driver.wait(2);
        sprintLogin.passwordBox.sendKeys(ConfigurationReader.getProperty("password_employee"));
        Driver.wait(2);
        sprintLogin.signInButton2.click();
        Driver.wait(2);
    }

    @And("Emloyee entecredet the bank acoount to customer")
    public void emloyeeEntecredetTheBankAcoountToCustomer() {
        RegistrationStepDefitnitions a = new RegistrationStepDefitnitions();
        sprintOperation.myOperationsButton.click();
        Driver.wait(2);
        sprintOperation.manageCustomers.click();
        Driver.wait(2);
        sprintOperation.createANewCustomer.click();
        Driver.wait(2);
        sprintOperation.ssnTextBox.sendKeys("259-65-4598");
        Driver.wait(1);
        sprintOperation.searchButton.click();
        Driver.wait(1);
        sprintOperation.middle.sendKeys("TA");
        Driver.wait(1);
        sprintOperation.phoneNumber.sendKeys("369-369-3698");
        Driver.wait(1);
        sprintOperation.zipCode.sendKeys("5689");
        Driver.wait(1);
        sprintOperation.city.sendKeys("Amsterdam");
        Driver.wait(1);
        Select sprintObjesi = new Select(sprintOperation.countrySprint);
        sprintObjesi.selectByValue("24127");
        sprintOperation.state.sendKeys("Brabant");
        Driver.wait(1);
        sprintOperation.firstAcc.click();
        Driver.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.LEFT_CONTROL).click(sprintOperation.secondAcc).keyUp(Keys.LEFT_CONTROL).perform();
        sprintOperation.save.click();
        Driver.wait(1);

    }

    @Then("Team is successfully")
    public void teamIsSuccessfully() {
        System.out.println("Sprint basarili!");
    }


    @And("Employee log-out his account")
    public void employeeLogOutHisAccount() {
        sprintOperation.icon3.click();
        sprintOperation.signOut.click();
    }
}
