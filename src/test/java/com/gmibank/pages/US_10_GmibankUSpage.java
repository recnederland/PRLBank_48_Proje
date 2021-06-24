package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_10_GmibankUSpage {

    public US_10_GmibankUSpage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //PageFactory.initElements(Driver.getDriver(), this);


    @FindBy(xpath = "//span[normalize-space()='My Operations']")
    public WebElement gmi_MyOperationsSection;
    @FindBy(xpath = "//span[normalize-space()='Manage Customers']")
    public WebElement gmi_ManageCustomersSection;
    @FindBy(xpath = "//span[normalize-space()='Create a new Customer']")
    public WebElement gmi_CreateNewCustomerButton;
    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement gmi_Adresse;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement gmi_ErrorMessageRequriedAdress;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement gmi_ErrorMessageRequried;
    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement gmi_City;
    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement gmi_Country;
    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement gmi_State;



}
