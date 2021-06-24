package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_14_DateOfAccountCreationPage {
    public US_14_DateOfAccountCreationPage(){
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

    @FindBy(xpath="//*[text()='Manage Accounts']")  // operationstan sonraki manage accounts
    public WebElement manageAccounts;

    //US014 icin ilgili yerler ustteki account digerleri customer idi
    @FindBy(xpath="//*[text()='Create a new Account']") // manage accountstan sonraki sayfa sag ustteki create new account
    public WebElement createNewAccount;

    @FindBy(xpath="//input[@name='description']")           //create a new account sonraki sayfadaki description alanı
    public WebElement descriptionBox;

    @FindBy(xpath="//input[@name='balance']")           //create a new account sonraki sayfadaki balance alanı
    public WebElement balanceBox;

    @FindBy(xpath="//input[@id='tp-account-createDate']")  //create a new account sonraki sayfadaki create date alanı
    public WebElement createDateAcc;

    @FindBy(id="save-entity")                              // sayfa sonundaki save butonu
    public  WebElement saveButtonAcc;



}
