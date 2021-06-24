package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class US_11_DateOfCustomerCreationPage {
    public US_11_DateOfCustomerCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@aria-haspopup='true']")  //insan ikonu sag ustteki
    public WebElement HumanIcon;

    @FindBy(xpath="//*[text()='Sign in'][1]")    //signin secenegi
    public WebElement SigninOption;

    @FindBy(id="username")                       //signin tiklayınca gelen username kutusu
    public WebElement usernameKutusu;

    @FindBy(id="password")                      //signin tiklayınca gelen password kutusu
    public WebElement passwordKutusu;

    @FindBy(xpath="//*[@type='submit']")       //signin onay butonu
    public WebElement signinButton;

    @FindBy(xpath="//*[text()='team48employeefirst team48employeelast']")
    public WebElement firstLastName;

    //sign in to manage customers
    @FindBy(xpath="//*[text()='My Operations']")    // signin olduktan sonra my operations
    public WebElement myOperations;

    @FindBy(xpath="//*[text()='Manage Customers']")  // operationstan sonraki manage customers
    public WebElement manageCustomers;

    //us011 icin gereken yerler
    @FindBy(xpath="//*[text()='Create a new Customer']")  //manage customerstan sonraki create a new customer
    public WebElement createNewCustomer;

    @FindBy(id="search-ssn")                             //sayfaya gelince ilgili kullanici icin ssn search box
    public WebElement searchSsnBox;
    @FindBy(xpath="//button[text()='Search']")
    public WebElement searchButton;
    @FindBy(xpath="//input[@id='tp-customer-firstName']") //sayfadaki firsat name kutusu
    public WebElement fnameBox;
    @FindBy(xpath="//input[@id='tp-customer-lastName']")   //sayfadaki last name kutusu
    public WebElement lnameBox;
    @FindBy(xpath="//input[@name='middleInitial']")        // middle initial kutusu
    public WebElement middleInBox;
    @FindBy(xpath="//input[@name='email']")
    public WebElement emailBox;
    @FindBy(xpath="//input[@name='mobilePhoneNumber']")
    public WebElement mobilePhoneBox;
    @FindBy(xpath="//input[@name='phoneNumber']")
    public WebElement phoneBox;
    @FindBy(xpath="//input[@name='zipCode']")
    public WebElement zipCodeBox;
    @FindBy(xpath="//input[@name='address']")
    public WebElement addressBox;
    @FindBy(xpath="//input[@name='city']")
    public WebElement cityBox;
    @FindBy(xpath="//input[@name='ssn']")
    public WebElement ssnBox;
    @FindBy(xpath="//select[@name='country.id']")
    public WebElement chooseCountry;
    @FindBy(xpath="//input[@name='state']")
    public WebElement stateBox;


    @FindBy(id="tp-customer-createDate")                 //createnewcustomerdan sonraki gelen ekranda createdate textbox
    public WebElement customerDate;

    @FindBy(xpath="//select[@name='user.id']")                       //aynı sayfadaki user secilen dropdown
    public WebElement chooseUser;

    // @FindBy(xpath="//select[@id='tp-customer-account']")
    @FindBy(xpath="//select[@name='accounts']")                                      //aynı sayfadaki account secilen dropdown
    public WebElement chooseAccount;

    @FindBy(id="tp-customer-zelleEnrolled")              //aynı sayfadaki zelle checkbox
    public WebElement zelleEnroll;

    @FindBy(id="save-entity")                           // aynı sayfa sonu save button
    public WebElement saveButton;

    @FindBy(xpath="//div[@role='alert']")             //Internal server error.
    public WebElement intseralert;


    public void types_valid_values_in_required_fields() {
        this.middleInBox.sendKeys("K");
        Driver.wait(1);
        this.phoneBox.sendKeys("452-456-4587");
        Driver.wait(1);
        this.zipCodeBox.sendKeys("20202");
        Driver.wait(1);
        this.cityBox.sendKeys("Dallas");
        Driver.wait(1);
        Select select =new Select(this.chooseCountry);
        select.selectByIndex(4);
        Driver.wait(1);
        this.stateBox.sendKeys("Texas");
        Driver.wait(1);

    }

}
