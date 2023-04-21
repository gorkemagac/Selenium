package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

       WebElement abTestLink =  driver.findElement(By.linkText("A/B Testing"));

        abTestLink.click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("Title Verification PASS");
        }
        else
        {
            System.out.println("Title Verification FAILED");
        }

        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("Title Verification PASS");
        }
        else
        {
            System.out.println("Title Verification FAILED");
        }



    }
}
