package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_Confirmation_Alert_Practice {
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
    public void alertPractice()
    {

        WebElement clickForJsConfirm = driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']"));
        clickForJsConfirm.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultMessage = driver.findElement(By.xpath("//p[@id ='result']"));

        String expectedText = "You clicked: Ok";
        String actualText =resultMessage.getText();

        Assert.assertEquals(expectedText,actualText);

    }
}
