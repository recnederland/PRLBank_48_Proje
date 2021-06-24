package com.gmibank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;
    static{
        String path = "configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }catch (Exception e){

        }
    }
    //  ConfigurationReader.getProperty("username")  ---> manager2
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    public static void viewButtonHover(String email){
        //td[contains(text(),'newxx03@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-info btn-sm']
        String beforeXpath="//td[contains(text(),'";
        String afterXpath="')]//parent::td//following-sibling::td//div//a[@class='btn btn-info btn-sm']";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(viewButton).perform();
      //  boolean v = viewButton.getText().contains("View");

    }

    public static void viewButtonHoverClick(String email){
        //td[contains(text(),'newxx03@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-info btn-sm']
       String beforeXpath="//td[contains(text(),'";
       String afterXpath="')]//parent::td//following-sibling::td//div//a[@class='btn btn-info btn-sm']";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(viewButton).click().perform();

    }

    public static void editButtonHover(String email){
        // editButtonXpath= //td[contains(text(),'newxx03@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-primary btn-sm']
        String beforeXpath="//td[contains(text(),'";
        String afterXpath="')]//parent::td//following-sibling::td//div//a[@class='btn btn-primary btn-sm']";
        WebElement editButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(editButton).perform();
    }

    public static void editButtonHoverClick(String email){
        // editButtonXpath= //td[contains(text(),'newxx03@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-primary btn-sm']
        String beforeXpath="//td[contains(text(),'";
        String afterXpath="')]//parent::td//following-sibling::td//div//a[@class='btn btn-primary btn-sm']";
        WebElement editButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(editButton).click().perform();
    }

    public static void deleteButtonHover(String email){
        // deleteButtonXpath= //td[contains(text(),'newxx03@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-danger btn-sm']
        String beforeXpath="//td[contains(text(),'";
        String afterXpath="')]//parent::td//following-sibling::td//div//a[@class='btn btn-danger btn-sm']";
        WebElement deleteButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteButton).perform();
    }
    public static void deleteButtonHoverClick(String email){
        // deleteButtonXpath= //td[contains(text(),'lindapine@gmail.com')]//parent::td//following-sibling::td//div//a[@class='btn btn-danger btn-sm']
        String beforeXpath = "//td[contains(text(),'";
        String afterXpath  = "')]//parent::td//following-sibling::td//div//a[@class='btn btn-danger btn-sm']";
        WebElement deleteButton= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteButton).click().perform();

    }

    //dd[.='lindabell@gmail.com']
    public static void verifyViewElement(String email) {
        String beforeXpath="//dd[.='";
        String  afterXpath="']";
        Driver.wait(2);
        WebElement actualEmail= Driver.getDriver().findElement(By.xpath(beforeXpath + email + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Driver.wait(2);
        actions.moveToElement(actualEmail).toString().equals(email);
    }


}
