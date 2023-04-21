package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_FacebookTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        System.out.println(expectedTitle);
        System.out.println(actualTitle);

        if(expectedTitle.equals(actualTitle))
        {
            System.out.println("Title verification PASSED");
        }
        else
        {
            System.out.println("Title verification FAILED");
        }


    }
}
