package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_FacebookLoginVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        WebElement allowEssentialCookies =  driver.findElement(By.xpath("//*[@data-testid='cookie-policy-manage-dialog-accept-button']"));
        allowEssentialCookies.click();

       WebElement emailInput = driver.findElement(By.id("email"));
       emailInput.sendKeys("AAA");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("BBB");

        WebElement logInButton =  driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
        logInButton.click();

        Thread.sleep(17000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook";

        System.out.println(actualTitle);
        System.out.println(expectedTitle);

        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("Title Verification Test PASSED");
        }
        else
        {
            System.out.println("Title Verification Test FAILED");
        }

    }
}
