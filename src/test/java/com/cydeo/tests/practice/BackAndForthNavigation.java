package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement acceptButton = driver.findElement(By.id("L2AGLb"));
        acceptButton.click();

        WebElement gmailButton = driver.findElement(By.className("gb_j"));
        gmailButton.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Title Verification has PASSED");
        }
        else
        {
            System.out.println("Title Verification has FAILED");
        }

        driver.navigate().back();

        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Title Verification has PASSED");
        }
        else
        {
            System.out.println("Title Verification has FAILED");
        }
        driver.quit();
    }
}
