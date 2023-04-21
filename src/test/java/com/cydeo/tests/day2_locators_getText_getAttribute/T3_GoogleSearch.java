package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://Google.com");

        WebElement acceptAllBtn = driver.findElement(By.id("L2AGLb"));
        acceptAllBtn.click();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Apple"+ Keys.ENTER);

        String expectedInTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle))
        {
            System.out.println("Title verification PASSED");
        }
        else
        {
            System.out.println("Title verification FAILED");
        }





    }
}
