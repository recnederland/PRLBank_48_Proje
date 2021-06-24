package com.gmibank.stepdefinitions;

//import com.gmibank.pages.US_016_MoneyTransferPage;
//import com.gmibank.utilities.ConfigurationReader;
//import com.gmibank.utilities.Driver;

import com.gmibank.pages.US_016_MoneyTransferPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_16_MoneyTransferStepDef {

    US_016_MoneyTransferPage transfer = new US_016_MoneyTransferPage();

    double totalBalance1;
    double totalBalance2;
//    double gonderilecekPara;
//    double gonderilecekParaCent;

    String gonderilecekParaString     = ConfigurationReader.getProperty("gonderilecekPara");
    double gonderilecekPara = Double.parseDouble(gonderilecekParaString);
    String gonderilecekParaCentString = ConfigurationReader.getProperty("gonderilecekParaCent");
    double gonderilecekParaCent = Double.parseDouble(gonderilecekParaCentString);

    double gonderilenTotal = gonderilecekPara + gonderilecekParaCent;




        //    int totalBalance1;
//    int totalBalance2;
////    double gonderilecekPara;
////    double gonderilecekParaCent;
//
//    String gonderilecekParaString     = ConfigurationReader.getProperty("gonderilecekPara");
//    int gonderilecekPara = Integer.parseInt(gonderilecekParaString);
//    String gonderilecekParaCentString = ConfigurationReader.getProperty("gonderilecekParaCent");
//    int gonderilecekParaCent = Integer.parseInt(gonderilecekParaCentString);
//
//    int gonderilenTotal = gonderilecekPara + gonderilecekParaCent;
//
//    int first = Integer.parseInt(transfer.firstAccountBalance.getText());
//    int second = Integer.parseInt(transfer.secondAccountBalance.getText());

    @Then("User click on the sign in button")
    public void duserClickOnTheSignInButton() {
        transfer.submitSignin.click();
        Driver.wait(1);
    }


    @And("DUser navigates to Transfer Money Page")
    public void duserNavigatesToTransferMoneyPage() {
        transfer.myOperationsButton.click();
        Driver.wait(1);
        transfer.transferMoneyButton.click();
        Driver.wait(1);
    }

    @Then("DUser does the money transfer")
    public void duserDoesTheMoneyTransfer() {
//        double first = Double.parseDouble(transfer.firstAccountBalance.getText());
//        double second = Double.parseDouble(transfer.secondAccountBalance.getText());
//
//
//        System.out.println("Transfer oncesi ilk hesap: "   + first);
//        System.out.println("Transfer oncesi ikinci hesap: "+ second);

        gonderilecekPara = 100;
        gonderilecekParaCent = 50;

        //Assert.assertTrue(transfer.firstAccountBalance.isEnabled());
        //Assert.assertTrue(transfer.secondAccountBalance.isEnabled());

        Driver.wait(2);
        Select select1 = new Select(transfer.fromDropDown);
        select1.selectByIndex(2);
        Driver.wait(1);
        Select select2 = new Select(transfer.toDropDown);
        select2.selectByIndex(1);
        Driver.wait(1);
        transfer.balanceTextBox.sendKeys(ConfigurationReader.getProperty("gonderilecekPara"));
        //transfer.balanceTextBox.sendKeys(gonderilecekPara + "");
        Driver.wait(1);
        transfer.balanceCentTextBox.clear();
        Driver.wait(1);
        transfer.balanceCentTextBox.sendKeys(ConfigurationReader.getProperty("gonderilecekParaCent"));
        // transfer.balanceCentTextBox.sendKeys(gonderilecekParaCent + "");
        Driver.wait(1);
        transfer.descriptionTextBox.sendKeys("Taksit");
        Driver.wait(1);
        transfer.makeTransferButton.click();
        Driver.wait(2);
    }

    @And("DUser validates that User s money transferred successfully")
    public void duserValidatesThatUserSMoneyTransferredSuccessfully() {

        Assert.assertTrue(transfer.onayMesaji.isEnabled());

        transfer.myOperationsButton.click();
        Driver.wait(1);
        transfer.myAccountsButton.click();
        Driver.wait(1);

        String firstString = transfer.firstAccountBalance.getText();
        double firstStringD = Double.parseDouble(transfer.firstAccountBalance.getText());
        String secondString = transfer.secondAccountBalance.getText();
        double firstLast = Double.parseDouble(firstString) + gonderilenTotal;
        double secondSecond = Double.parseDouble(secondString) + gonderilenTotal;
        double firstMoneyFirstAccount = Double.parseDouble(firstLast +"");
        double secondMoneySecondAccount = Double.parseDouble(secondSecond + "");

        System.out.println("    Tebrikler transfer isleminiz gerceklesmistir...");
        System.out.println("Transfer sonrasi ilk hesap: "   + firstString);
        System.out.println("Transfer sonrasi ikinci hesap: "+ secondString);

    }
}
