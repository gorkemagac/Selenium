package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://yahoo.com");

        String expectedTitle = "Yahoo is part of the Yahoo family of brands";

        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("Title is as expected. Verification Passed");
        }
        else
        {
            System.out.println("Title is NOT as expected. Verification Failed");
        }

        driver.close();



    }
}
