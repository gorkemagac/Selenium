package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @AfterMethod
    public void close()
    {
        driver.quit();
    }

    @BeforeMethod
    public void setupMethod()
    {
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertPractice() {

        WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlert.click();

        Alert buttonAlert = driver.switchTo().alert();



        buttonAlert.accept();

        WebElement alertMessage = driver.findElement(By.xpath("//p[@id='result']"));

        String actualText = alertMessage.getText();
        String expectedText = "You successfully clicked an alert";

        Assert.assertEquals(actualText,expectedText);


    }
}
