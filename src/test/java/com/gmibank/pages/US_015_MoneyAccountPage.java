package com.gmibank.pages;

//import com.gmibank.utilities.Driver;
import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_015_MoneyAccountPage {

    public US_015_MoneyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy( id = "account-menu")
    public WebElement iconButton;

    @FindBy ( xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signInButtonHomePage;

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement signInButtonSignInPage;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy ( xpath = "(//input[@id])[2]")
    public WebElement passwordTextBox;

    @FindBy ( xpath = "//*[(text()='My Operations')]")
    public WebElement myOperationsButton;

    @FindBy ( xpath = "//*[text()='My Accounts']")
    public WebElement myAccountsButton;

    @FindBy ( xpath ="((//tbody//tr)[1]//td)[3]")
    public WebElement firstAccountBalance;

    @FindBy ( xpath ="((//tbody//tr)[2]//td)[3]")
    public WebElement secondAccountBalance;

    @FindBy ( xpath ="//*[text()='Transfer Money']")
    public WebElement transferMoneyButton;

    @FindBy (id = "fromAccountId")
    public WebElement fromDropDown;

    @FindBy (id = "toAccountId")
    public WebElement toDropDown;

    @FindBy ( id = "balance")
    public WebElement balanceTextBox;

    @FindBy ( id = "balancecent")
    public WebElement balanceCentTextBox;

    @FindBy ( id = "description")
    public WebElement descriptionTextBox;

    @FindBy ( id = "make-transfer")
    public WebElement makeTransferButton;
}