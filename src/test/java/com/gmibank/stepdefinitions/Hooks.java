package com.gmibank.stepdefinitions;

import com.gmibank.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        //System.out.println("setUp Çalıştı.");
    }

    @After
        public void tearDown(Scenario scenario){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           if(scenario.isFailed()){
               scenario.embed(screenshot , "image/png");
            }
             Driver.closeDriver();
        }
}
