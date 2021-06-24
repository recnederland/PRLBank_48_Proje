package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_06_UserInfoSegment {
    public US_06_UserInfoSegment(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="account-menu")
    public WebElement userNameTopRightCorner;

    @FindBy(partialLinkText="//span[contains(text(),\"User Info\")]")
    public WebElement userInfo;

    @FindBy(className = "//label[@for=\"firstName\"]")
    public WebElement firstName;

    @FindBy(className = "//label[@for=\"lastName\"]")
    public WebElement lastName;

    @FindBy(className = "//label[@for=\"email\"]")
    public WebElement email;

    @FindBy(className = "//label[@for=\"langKey\"]")
    public WebElement language;

    @FindBy(name="[name=langKey]")
    public WebElement languages;

    @FindBy(name = "[name=firstName]")
    public WebElement firstNameUpdate;

    @FindBy(name = "[name=lastName]")
    public WebElement lastNameUpdate;

    @FindBy(name = "[name=email]")
    public WebElement emailUpdate;



    public void UserInfo(){

        userNameTopRightCorner.click();
        userInfo.click();

//        System.out.println("firstName.getText() = " + firstName.getText());
//        System.out.println("lastName.getText() = " + lastName.getText());
//        System.out.println("email.getText() = " + email.getText());
//        System.out.println("language.getText() = " + language.getText());
    }
}
