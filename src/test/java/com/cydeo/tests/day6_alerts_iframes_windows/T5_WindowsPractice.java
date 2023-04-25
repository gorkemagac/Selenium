package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @BeforeMethod
    public void setupMethod() {
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowHandle()
    {
        String window = driver.getWindowHandle();
        System.out.println(window);

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

       WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
       clickHereLink.click();


        for (String each: driver.getWindowHandles())
        {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        System.out.println("Title after click: " + actualTitle);
        driver.switchTo().window(window);

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
