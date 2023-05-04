package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AutoComplete {
    WebDriver driver = WebDriverFactory.getDriver("chrome");




    @BeforeMethod
    public void setupMethod() {
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/autocomplete");
    }

    @Test
    public void AutoCompleteTask()
    {
        WebElement inputBox = driver.findElement(By.name("myCountry"));
        inputBox.sendKeys("Cyprus");

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        WebElement textResult = driver.findElement(By.id("result"));
        String actualText = textResult.getText();
        String expectedText = "You selected: Cyprus";

        Assert.assertEquals(actualText,expectedText);

    }
}
