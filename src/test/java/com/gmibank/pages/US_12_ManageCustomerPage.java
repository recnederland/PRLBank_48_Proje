package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_12_ManageCustomerPage {
    public US_12_ManageCustomerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //homepage to sign in
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

    // test cases start
    //TC_001
    @FindBy(xpath = "//thead")                         //??? tekil mi cogul mu yeterli mi?
    public WebElement tableHeader;

    @FindBy(xpath="//*[@data-icon='sort']")          // manage customer listede asagi yukari hareket butonları
    public WebElement sortButton;

    @FindBy(xpath="//div/a[@class='btn btn-info btn-sm']")
    //@FindBy(xpath="//*[@data-icon='eye']")           //manage customer ekraninda view buton
    public WebElement viewButton;

    @FindBy(xpath="//tbody/tr/td[3]")                  //view ine tiklanan kisisnin ilk ekran soyisim bilgisi
    public WebElement firstData;

    @FindAll({@FindBy(xpath="//*[@data-icon='eye']")})
    public List<WebElement> viewList;

    @FindBy(xpath="//*[@data-icon='pencil-alt']")    //manage customer ekraninda edit buton
    public WebElement editButton;

    @FindAll({@FindBy(xpath="//*[@data-icon='pencil-alt']")})  //
    public List<WebElement> editList;

    @FindBy(xpath="//*[@data-icon='trash']")         //manage customer ekraninda delete buton
    public WebElement deleteButton;

    @FindAll({@FindBy(xpath="//*[@data-icon='trash']")})
    public List<WebElement> deleteList;

    @FindBy(xpath="//*[@class='btn btn-primary']")
    public WebElement singleEditButton;              //view tikladiktan sonra en alttaki edit buton

    @FindBy(xpath="//dd")
    public WebElement singleCustomerInfo;

    @FindAll({@FindBy(xpath="//dd")})
    public List<WebElement> CustomerInfo;

    @FindBy(id="lastNameLabel")                 //4. tc icin
    public WebElement updateData;

    @FindBy(id="save-entity")                    //update yapilan sayfa save buton
    public WebElement saveData;

    @FindBy(xpath = "//button[@class='btn btn-danger']")  //delete emin misin butonu
    public WebElement deleteOkButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")  //silince cikan tost mesaj
    public  WebElement deleteToastMessage;

}
