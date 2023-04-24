package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {
    WebDriver driver = WebDriverFactory.getDriver("chrome");



    @BeforeMethod
    public void setupMethod()
    {
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest()
    {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

       WebElement currentlySelectedOption =  simpleDropdown.getFirstSelectedOption();

       String actualSimpleDropdownText = currentlySelectedOption.getText();
       String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);
    }

}
