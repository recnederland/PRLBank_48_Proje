package com.gmibank.pages;

//import com.gmibank.utilities.Driver;
import com.gmibank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationAndHomePage extends BasePage {
    public RegistrationAndHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInTik;

    @FindBy(id = "username")
    public WebElement usernameSignIn;
    @FindBy(id = "#password")
    public WebElement passwordSignin;

    @FindBy(id = "account-menu")
    public WebElement iconButton;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButtonHomePage;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(id = "address")
    public WebElement addressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneNumberTextBox;

    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerButtonRegistrationPage;

    @FindBy(xpath = "//div[@role='alert']")
    public List<WebElement> successMessage;

    @FindBy(xpath = "//*[contains(text(),'Registration saved!')]")
    public WebElement successMessage2;

//    @FindBy(className = "//div[@className='invalid-feedback']")
//    public WebElement errormessage;

    @FindBy( xpath = "//div[@class='Toastify__toast-body']")
    public WebElement erroAllert;


    public WebElement passwordScore(String score){
        String strengthBarLocator = "//ul[@id='strengthBar']/li["+score+"]";
        return Driver.getDriver().findElement(By.xpath(strengthBarLocator));
    }

}
