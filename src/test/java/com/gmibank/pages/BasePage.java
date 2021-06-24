package com.gmibank.pages;

//import com.gmibank.utilities.Driver;
import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='About Us']")
    public WebElement aboutUsButton;

    //@FindBy(className = "dropdown nav-item")
    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement loginItem;

    @FindBy(xpath = "//*[.='Sign out']")
    public WebElement signoutItem;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomersButton;


}
