package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_GmiBankUs09Page {
    public US_09_GmiBankUs09Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //PageFactory.initElements(Driver.getDriver(),this);


    @FindBy(xpath = "//span[normalize-space()='My Operations']")
    public WebElement gmi_MyOperationsSection;
    @FindBy(xpath = "//span[normalize-space()='Manage Customers']")
    public WebElement gmi_ManageCustomersSection;
    @FindBy(xpath = "//span[normalize-space()='Create a new Customer']")
    public WebElement gmi_CreateNewCustomerButton;
    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement gmi_SsnField;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement gmi_SearchButton;
    @FindBy(id = "tp-customer-firstName")
    public WebElement gmi_Firstname;
    @FindBy(id = "tp-customer-lastName")
    public WebElement gmi_Lastname;
    @FindBy(id = "tp-customer-ssn")
    public WebElement gmi_Ssn;

}

