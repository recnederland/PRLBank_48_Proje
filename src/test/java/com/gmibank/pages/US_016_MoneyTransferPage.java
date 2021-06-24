package com.gmibank.pages;

//import com.gmibank.utilities.Driver;
import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_016_MoneyTransferPage {

    public US_016_MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy ( id = "account-menu")
    public WebElement iconButton;

    @FindBy ( xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signInButtonHomePage;

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement signInButtonSignInPage;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy ( xpath = "(//input[@id])[2]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitSignin;

    @FindBy ( xpath = "//*[(text()='My Operations')]")
    public WebElement myOperationsButton;

    @FindBy ( xpath = "//span[text()='My Operations']")
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

    @FindBy(xpath = "//*[text()='Transfer is succesfull']")
    public WebElement onayMesaji;


    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "(//a)[16]")
    public WebElement createANewCustomer;

    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement ssnFaker;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middle;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countrySprint;

    @FindBy(xpath = "(//input)[13]")
    public WebElement state;

    @FindBy(xpath = "//*[text()='Saving']")
    public WebElement firstAcc;

    @FindBy(xpath = "//*[text()='deneme']")
    public WebElement secondAcc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;


    @FindBy(xpath = "(//a)[12]")
    public WebElement icon3;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;




}