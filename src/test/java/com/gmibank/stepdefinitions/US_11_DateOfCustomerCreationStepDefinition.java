package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.pages.US_11_DateOfCustomerCreationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;
import java.util.Random;

public class US_11_DateOfCustomerCreationStepDefinition {

    String dateholder;
    WebElement option;
    LocalDateTime now= LocalDateTime.now();
    Random random = new Random();

    US_11_DateOfCustomerCreationPage us011_dateOfCustomerCreationPage = new US_11_DateOfCustomerCreationPage();


    //homepage to sign in
    @Given("Employee at the homepage_11 {string}")
    public void employee_at_the_homepage_11(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));

    }

    @And("clicks the human icon at the right top_11")
    public void clicks_the_human_icon_at_the_right_top_11() {
        us011_dateOfCustomerCreationPage.HumanIcon.click();
    }

    @And("chooses sign in option_11")
    public void chooses_sign_in_option_11() {
        us011_dateOfCustomerCreationPage.SigninOption.click();
    }

    @And("gives {string} to username textbox_11")
    public void gives_to_username_textbox_11(String string) {
        us011_dateOfCustomerCreationPage.usernameKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("gives {string} to password textbox_11")
    public void gives_to_password_textbox_11(String string) {
        us011_dateOfCustomerCreationPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("clicks the sign in button_11")
    public void clicks_the_sign_in_button_11() {
        us011_dateOfCustomerCreationPage.signinButton.click();
    }

    @And("employee sign in successfully_11")
    public void employee_sign_in_successfully_11() {
        //eger sağ üstte isim soyisim görüyorsa giris yapabilmis demektir.
        if(us011_dateOfCustomerCreationPage.firstLastName.isDisplayed()){
            System.out.println("Employee log in successfully!");
        }
    }
    //buraya kadar 12 icin olan login ile aynı duplicate hatasiyla ugrasmamak icin sonlarina 11 ekledim. zaten toplu olunca logini ayrı tutacaksın.
    @And("clicks the my operations area_11")
    public void clicks_the_my_operations_area_11() {
        us011_dateOfCustomerCreationPage.myOperations.click();

    }

    @And("chooses manage customer option_11")
    public void chooses_manage_customer_option_11() {
        us011_dateOfCustomerCreationPage.manageCustomers.click();
    }
    //burası da aynı manage customer sayfasina geliyor.


    @And("clicks create new customer area_11")
    public void clicks_create_new_customer_area_11(){
        us011_dateOfCustomerCreationPage.createNewCustomer.click();
    }
//testcases start

    //TC001
    @Given("employee types a valid ssn in searchbox")
    public void employee_types_a_valid_ssn_in_searchbox() {
        us011_dateOfCustomerCreationPage.searchSsnBox.sendKeys("515-15-1515");
        Driver.wait(1);
        us011_dateOfCustomerCreationPage.searchButton.click();
        Driver.wait(2);

    }
    @And("types valid values in required fields")
    public void types_valid_values_in_required_fields(){
        us011_dateOfCustomerCreationPage.types_valid_values_in_required_fields();
    }


    @When("employee tries to type date earlier than customer creation date")
    public void employee_tries_to_type_date_earlier_than_customer_creation_date(){

        us011_dateOfCustomerCreationPage.customerDate.click();
        Driver.wait(1);
        us011_dateOfCustomerCreationPage.customerDate.sendKeys("13.06.2021"+ Keys.TAB+"00:00");
        Driver.wait(1);

    }
    @Then("must see can not type earlier date")
    public void must_see_can_not_type_earlier_date(){
        String givenDate=us011_dateOfCustomerCreationPage.customerDate.getAttribute("value");
        System.out.println(givenDate);
        LocalDateTime dateTime = LocalDateTime.parse(givenDate);
        Assert.assertFalse(dateTime.isBefore(now));
        System.out.println("Date is correct!");

        //SoftAssert sa = new SoftAssert();
        //sa.assertFalse(dateTime.isBefore(now),"Date is correct!");
        //us011_dateOfCustomerCreationPage.saveButton.click();
        // sa.assertFalse(us011_dateOfCustomerCreationPage.intseralert.isDisplayed(),"error message not found!");
        // sa.assertAll();

    }
    //TC002
    @When("employee gets the format of date")
    public void employee_gets_the_format_of_date() {
        dateholder=us011_dateOfCustomerCreationPage.customerDate.getAttribute("placeholder");
    }

    @Then("date format should be month day year hour and minute")
    public void date_format_should_be_month_day_year_hour_and_minute() {
        Assert.assertTrue("Format of date is not correct!",dateholder.matches("MM-DD-YYYY HH:mm"));
        System.out.println("format of date is correct");


    }
    //TC003
    @When("employee can choose user from dropdown")
    public void employee_can_choose_user_from_dropdown() {

        Select select =new Select(us011_dateOfCustomerCreationPage.chooseUser);

        try{
            //WebElement option = Driver.selectRandomTextFromDropdown(select);
        }
        catch(Exception ex)
        {
            String isDisabled=us011_dateOfCustomerCreationPage.chooseUser.getAttribute("disabled");
            Assert.assertNotNull("dropdown is disabled",isDisabled);
        }
    }

    @Then("if do not choose user should get a warning")
    public void if_do_not_choose_user_should_get_a_warning() {

        Assert.assertFalse("You should choose a user!",option.getAttribute("value").isEmpty());

    }
//TC004

    @When("employee try to choose account from dropdown")
    public void employee_try_to_choose_account_from_dropdown() {

        Select select = new Select(us011_dateOfCustomerCreationPage.chooseAccount);
        Driver.wait(2);
        try {
            //option = Driver.selectRandomTextFromDropdown(select);
        }
        catch(Exception ex){
            // Assert.fail("account choice failed");
        }

    }
    @Then("can do that")
    public void can_do_that(){
        Assert.assertFalse("Can't choose an account",option.getAttribute("value").isEmpty());
        System.out.println("User can choose an account");

    }
    //TC005
    @When("employee want to select zelle enrollment")
    public void employee_want_to_select_zelle_enrollment() {

        us011_dateOfCustomerCreationPage.zelleEnroll.click();

    }

    @Then("can select and save it")
    public void can_select_and_save_it() {
        Assert.assertTrue("zelle option not selected",us011_dateOfCustomerCreationPage.zelleEnroll.isSelected());

        //us011_dateOfCustomerCreationPage.saveButton.click();
        //Assert.assertTrue("zelle option not saved",us011_dateOfCustomerCreationPage.saveButton.isSelected());
        //System.out.println("zelle option selected and saved! ");
    }

}
