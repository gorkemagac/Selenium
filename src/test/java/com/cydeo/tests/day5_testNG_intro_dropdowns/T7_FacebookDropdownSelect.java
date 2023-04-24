package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_FacebookDropdownSelect {
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
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest() {
       WebElement dropdownLink = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
       dropdownLink.click();

     WebElement facebookButton = driver.findElement(By.xpath("//a[text()='Facebook']"));
      facebookButton.click();

      String actualTitle =  driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
