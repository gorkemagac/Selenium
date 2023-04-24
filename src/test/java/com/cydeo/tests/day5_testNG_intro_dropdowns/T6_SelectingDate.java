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

public class T6_SelectingDate {
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
        driver.get("https://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void simpleDropdownTest()
    {
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id = 'year']")));
        selectYear.selectByVisibleText("1924");

        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
        selectMonth.selectByValue("11");

        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id = 'day']")));
        selectDay.selectByIndex(0);

        String actualDate =selectMonth.getFirstSelectedOption().getText()+ " " +selectDay.getFirstSelectedOption().getText()+"st, " + selectYear.getFirstSelectedOption().getText();
        String expectedDate = "December 1st, 1924";

        Assert.assertEquals(actualDate,expectedDate);
    }
}
