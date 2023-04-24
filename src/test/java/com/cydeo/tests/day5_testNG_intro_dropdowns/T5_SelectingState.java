package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class T5_SelectingState {
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
    public void simpleDropdownTest()
    {
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5);

        String actualState = stateDropdown.getFirstSelectedOption().getText();
        String expectedState = "California";

        Assert.assertEquals(actualState,expectedState);

    }
}
