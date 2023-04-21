package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "cydeo";

        if(actualURL.contains(expectedURL))
        {
            System.out.println("URL contains cydeo");
        }
        else
        {
            System.out.println("URL does not contain cydeo");

        }

        String actualTitle = driver.getTitle();
        String expectedTitle= "Practice";

        if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Title contains practice");
        }
        else
        {
            System.out.println("Title does not contain practice");
        }

        driver.close();
    }
}
