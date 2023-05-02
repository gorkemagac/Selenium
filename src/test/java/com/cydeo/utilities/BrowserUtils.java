package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second)
    {
        second *=1000;
        try{
            Thread.sleep(second);
        }
        catch(InterruptedException e)
        {

        }
    }

    public static void switchWindowsAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle)
    {
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
            String actualTitle = driver.getTitle();

            Assert.assertTrue(actualTitle.contains(expectedInTitle));
        }



    }
    public static void verifyTitle(WebDriver driver, String expectedTitle)
    {
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


}
