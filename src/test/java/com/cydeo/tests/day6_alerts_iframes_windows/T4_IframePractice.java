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

public class T4_IframePractice {
    WebDriver driver = WebDriverFactory.getDriver("chrome");


    @BeforeMethod
    public void setupMethod() {
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test()
    {
        WebElement yourContentGoesHereText = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(yourContentGoesHereText);

        WebElement textBox = driver.findElement(By.tagName("p"));
        Assert.assertTrue(textBox.isDisplayed());

        driver.switchTo().parentFrame();

       WebElement headerText =  driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());



    }
}
