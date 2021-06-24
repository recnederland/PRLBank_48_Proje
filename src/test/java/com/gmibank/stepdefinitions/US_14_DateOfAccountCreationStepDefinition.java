package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.pages.US_14_DateOfAccountCreationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;

public class US_14_DateOfAccountCreationStepDefinition {

    String dateholder;
    LocalDateTime now= LocalDateTime.now();

    US_14_DateOfAccountCreationPage us014_dateOfAccountCreationPage= new US_14_DateOfAccountCreationPage();

    @Given("Employee at the homepage_14 {string}")
    public void employee_at_the_homepage_(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));


    }

    @And("clicks the human icon at the right top_14")
    public void clicks_the_human_icon_at_the_right_top_14() {
        us014_dateOfAccountCreationPage.HumanIcon.click();

    }

    @And("chooses sign in option_14")
    public void chooses_sign_in_option_14(){
        us014_dateOfAccountCreationPage.SigninOption.click();
    }

    @And("gives {string} to username textbox_14")
    public void gives_to_username_textbox_14(String string) {
        us014_dateOfAccountCreationPage.usernameKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("gives {string} to password textbox_14")
    public void gives_to_password_textbox_14(String string) {
        us014_dateOfAccountCreationPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("clicks the sign in button_14")
    public void clicks_the_sign_in_button_14() {
        us014_dateOfAccountCreationPage.signinButton.click();

    }

    @And("employee sign in successfully_14")
    public void employee_sign_in_successfully_14() {
        //eger sağ üstte isim soyisim görüyorsa giris yapabilmis demektir.
        if( us014_dateOfAccountCreationPage.firstLastName.isDisplayed()){
            System.out.println("Employee log in successfully!");
        }

    }

    @And("clicks the my operations area_14")
    public void clicks_the_my_operations_area_14() {
        us014_dateOfAccountCreationPage.myOperations.click();

    }

    @And("chooses manage accounts option_14")
    public void chooses_manage_accounts_option_14() {
        us014_dateOfAccountCreationPage.manageAccounts.click();

    }

    @And("clicks create new account area_14")
    public void clicks_create_new_account_area_14() {
        us014_dateOfAccountCreationPage.createNewAccount.click();

    }
    // buraya kadar login+ create account giris
    //TC001
    @And("employee types description and balance values")
    public void employee_types_description_and_balance_values() {
        us014_dateOfAccountCreationPage.descriptionBox.sendKeys("test datas");
        Driver.wait(1);
        us014_dateOfAccountCreationPage.balanceBox.sendKeys("5000");
        Driver.wait(1);

    }

    @When("employee tries to type date earlier than account creation date")
    public void employee_tries_to_type_date_earlier_than_account_creation_date() {
        us014_dateOfAccountCreationPage.createDateAcc.click();
        Driver.wait(2);
        us014_dateOfAccountCreationPage.createDateAcc.sendKeys("13.06.2021"+ Keys.TAB+"00:00");
        Driver.wait(2);
    }

    @Then("must see can not type earlier date than account creation")
    public void must_see_can_not_type_earlier_date_than_account_creation() {
        String givenDate=us014_dateOfAccountCreationPage.createDateAcc.getAttribute("value");
        System.out.println(givenDate);
        LocalDateTime dateTime = LocalDateTime.parse(givenDate);
        Assert.assertFalse(dateTime.isBefore(now));
        System.out.println("Date is correct!");

    }

    //TC002
    @Given("employee checks the format of date")
    public void employee_checks_the_format_of_date(){
        dateholder=us014_dateOfAccountCreationPage.createDateAcc.getAttribute("placeholder");
    }

    @Then("date must be month day year hour minute")
    public void date_must_be_month_day_year_hour_minute() {
        Assert.assertTrue("Format of date is correct!",dateholder.matches("MM-DD-YYYY HH:mm"));
    }

    //TC003
    @When("employee wants to choose user")
    public void employee_wants_to_choose_user() {

    }

    @Then("can choose user")
    public void can_choose_user() {
        Assert.fail("There is no dropdown for user choice!");
    }
    //TC004
    @When("employee wants to choose account")
    public void employee_wants_to_choose_account() {

    }

    @Then("can choose account")
    public void can_choose_account() {
        Assert.fail("There is no dropdown for account choice!");
    }
    //TC005
    @Given("employee wants select zelle")
    public void employee_wants_select_zelle() {

    }

    @Then("can select zelle")
    public void can_select_zelle() {
        Assert.fail("There is no checkbox for zelle option!");
    }
}
