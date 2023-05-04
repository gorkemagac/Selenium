package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment1 {
    public WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test()
    {
        driver.get("http://qatechhub.com");
        String expectedTitle = driver.getTitle();
        String actualTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";

        Assert.assertEquals(expectedTitle,actualTitle);

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        String expectedURL = driver.getCurrentUrl();
        System.out.println(expectedURL);

        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
