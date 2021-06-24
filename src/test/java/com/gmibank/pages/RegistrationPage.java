package com.gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement inputSSN;
    @FindBy (xpath = "//input[@name='firstname']")
    public WebElement inputFirstname;
    @FindBy (xpath = "//input[@name='lastname']")
    public WebElement inputLastname;
    @FindBy (xpath = "//input[@name='address']")
    public WebElement inputAddress;
    @FindBy (xpath = "//input[@name='mobilephone']")
    public WebElement inputPhone;
    @FindBy (xpath = "//input[@name='username']")
    public WebElement inputUsername;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement inputEmail;
    @FindBy (css = "#firstPassword")
    public WebElement inputFirstPassword;
    @FindBy (css = "#secondPassword")
    public WebElement inputSecondPassword;
    @FindBy (xpath = "//*[@*='invalid-feedback']")
    public WebElement invalidFeedback;
    @FindBy (css = "#register-submit")
    public WebElement registerBtn;
    @FindBy (css = "#strengthBar")
    public WebElement strengthBar;
    @FindBy (xpath = "//ul[@id='strengthBar']/li[1]")
    public WebElement passScore1;
    @FindBy (xpath = "//ul[@id='strengthBar']/li[2]")
    public WebElement passScore2;
    @FindBy (xpath = "//ul[@id='strengthBar']/li[3]")
    public WebElement passScore3;
    @FindBy (xpath = "//ul[@id='strengthBar']/li[4]")
    public WebElement passScore4;
    @FindBy (xpath = "//ul[@id='strengthBar']/li[5]")
    public WebElement passScore5;
    @FindBy (xpath = "//*[contains(text(),'Registration saved!')]")
    public WebElement registrationAlert;
    @FindBy(id = "register-title")
    public WebElement registrationTitle;
}