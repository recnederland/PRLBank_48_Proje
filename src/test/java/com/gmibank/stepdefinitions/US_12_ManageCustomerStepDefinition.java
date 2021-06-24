package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.pages.US_12_ManageCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class US_12_ManageCustomerStepDefinition {

    WebElement option;
    String oldValue, newData;
    US_12_ManageCustomerPage us012_manageCustomerPage = new US_12_ManageCustomerPage();

    @Given("Employee at the homepage {string}")
    public void employee_at_the_homepage(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));

    }

    @And("clicks the human icon at the right top")
    public void clicks_the_human_icon_at_the_right_top() {
        us012_manageCustomerPage.HumanIcon.click();
    }

    @And("chooses sign in option")
    public void chooses_sign_in_option() {
        us012_manageCustomerPage.SigninOption.click();
    }

    @And("gives {string} to username textbox")
    public void gives_to_username_textbox(String string) {
        us012_manageCustomerPage.usernameKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("gives {string} to password textbox")
    public void gives_to_password_textbox(String string) {
        us012_manageCustomerPage.passwordKutusu.sendKeys(ConfigurationReader.getProperty(string));

    }

    @And("clicks the sign in button")
    public void clicks_the_sign_in_button() {
        us012_manageCustomerPage.signinButton.click();
    }

    @And("employee sign in successfully")
    public void employee_sign_in_successfully() {
        //eger sağ üstte isim soyisim görüyorsa giris yapabilmis demektir.
        if(us012_manageCustomerPage.firstLastName.isDisplayed()){

            System.out.println("Employee log in successfully!");
        }
    }

    @And("clicks the my operations area")
    public void clicks_the_my_operations_area() {
        us012_manageCustomerPage.myOperations.click();

    }

    @And("chooses manage customer option")
    public void chooses_manage_customer_option() {
        us012_manageCustomerPage.manageCustomers.click();
    }
    ///////////////// buraya kadar login and navigate to manage customer////////////////


    // TC001
    @Given("kullanici webtable bilgilerini okumaya calisir")
    public void kullanici_webtable_bilgilerini_okumaya_calisir() {



        //String headerInfos=us012_manageCustomerPage.tableHeader.getText();
    }

    @Then("verify the table header contains the criterias and can read infos")
    public void verify_the_table_header_contains_the_criterias_and_can_read_infos() {
        //"First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date "
    }


    //TC002
    @Given("kullanici ekranda view butonlarindan birine tiklar")
    public void kullanici_ekranda_view_butonlarindan_birine_tiklar() {
        //int lastIndex= us012_manageCustomerPage.viewList.size()-1;
        // Random random = new Random();
        //int optionIndex = 1 + random.nextInt(lastIndex);
        //option=us012_manageCustomerPage.viewList.get(optionIndex);
        // option.click();
        us012_manageCustomerPage.viewButton.click();
        Driver.wait(2);


    }


    @Then("ilgili musterinin bilgilerine ulasir ve sayfanin en altinda bir edit butonu gorur")
    public void ilgili_musterinin_bilgilerine_ulasir_ve_sayfanin_en_altinda_bir_edit_butonu_gorur() {
        WebElement info= us012_manageCustomerPage.CustomerInfo.get(1);
        SoftAssert sa = new SoftAssert();
        sa.assertFalse(info.getText().isEmpty());

        sa.assertTrue(us012_manageCustomerPage.singleEditButton.isDisplayed());
        sa.assertAll();

    }


    //TC003
    @Then("kullanici ekranda edit butonlarindan birini gorur")
    public void kullanici_ekranda_edit_butonlarindan_birini_gorur() {
        Assert.assertTrue(us012_manageCustomerPage.editButton.isDisplayed());
    }


    //TC004
    @Given("kullanici ekranda edit butonlarindan birine tiklar")
    public void kullanici_ekranda_edit_butonlarindan_birine_tiklar() {
        oldValue= us012_manageCustomerPage.firstData.getText();
        us012_manageCustomerPage.editButton.click();
    }

    @Given("musterinin bilgilerini olusturur ya da degistirir")
    public void musterinin_bilgilerini_olusturur_ya_da_degistirir() {

        us012_manageCustomerPage.updateData.clear();
        us012_manageCustomerPage.updateData.sendKeys("newData");


    }

    @Then("bilgilerin son halini kaydeder")
    public void bilgilerin_son_halini_kaydeder() {
        us012_manageCustomerPage.saveData.click();
        newData=us012_manageCustomerPage.firstData.getText();
        Assert.assertNotSame(oldValue,newData);
        System.out.println("infos updated!");

    }
    //TC005
    @Given("kullanici ekranda delete butonlarindan birine tiklar")
    public void kullanici_ekranda_delete_butonlarindan_birine_tiklar() {


    }

    @Given("silme isleminle ilgili uyari ekranini gorur")
    public void silme_isleminle_ilgili_uyari_ekranini_gorur() {

    }

    @Then("silme islemini onaylar")
    public void silme_islemini_onaylar() {

    }



}
