package com.gmibank.stepdefinitions;

//import com.gmibank.pages.US_015_MoneyAccountPage;
//import com.gmibank.utilities.ConfigurationReader;

import com.gmibank.pages.US_015_MoneyAccountPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US_15_MoneyAccountStepDef {

    US_015_MoneyAccountPage account = new US_015_MoneyAccountPage();

    double totalBalance1;
    double totalBalance2;
    String gonderilecekParaString     = ConfigurationReader.getProperty("gonderilecekPara");
    double gonderilecekPara = Double.parseDouble(gonderilecekParaString);
    String gonderilecekParaCentString = ConfigurationReader.getProperty("gonderilecekParaCent");
    double gonderilecekParaCent = Double.parseDouble(gonderilecekParaCentString);
    double gonderilenTotal = gonderilecekPara + gonderilecekParaCent;

    @And("DUser navigates to sign in page")
    public void duserNavigatesToSignInPage() {
        account.iconButton.click();
        Driver.wait(1);
        account.signInButtonHomePage.click();
        Driver.wait(1);
    }

    @Then("DUser provide a valid username")
    public void duserProvideAValidUsername() {
        account.usernameTextBox.sendKeys("team48moneytransferaccount1");
        Driver.wait(1);
    }

    @And("DUser provide a valid password")
    public void duserProvideAValidPassword() {
        account.passwordTextBox.sendKeys("team48Money.");
        Driver.wait(1);
    }

    @Then("DUser click on the sign in button")
    public void duserClickOnTheSignInButton() {
        account.signInButtonSignInPage.click();
        Driver.wait(1);
    }

    @And("DUser navigates My Accounts Page")
    public void duserNavigatesMyAccountsPage() {
        Driver.wait(1);
        account.myOperationsButton.click();
        Driver.wait(1);
        account.myAccountsButton.click();
        Driver.wait(1);
    }

    @Then("DUser gets the info about Users accounts balance")
    public void duserGetsTheInfoAboutUsersAccountsBalance() {
        totalBalance1 = Double.parseDouble(account.firstAccountBalance.getText());
        Driver.wait(1);
        totalBalance2 = Double.parseDouble(account.secondAccountBalance.getText());
        Driver.wait(1);
    }

//    @And("DUser navigates to Transfer Money Page")
//    public void duserNavigatesToTransferMoneyPage() {
//        account.myOperationsButton.click();
//        Driver.wait(1);
//        account.transferMoneyButton.click();
//        Driver.wait(1);
//    }
}
//    @Then("DUser finds and validates the Account Type webelement on the page")
//    public void duser_finds_and_validates_the_Account_Type_webelement_on_the_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("DUser finds and validates the Balance webelement on the page")
//    public void duser_finds_and_validates_the_Balance_webelement_on_the_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }