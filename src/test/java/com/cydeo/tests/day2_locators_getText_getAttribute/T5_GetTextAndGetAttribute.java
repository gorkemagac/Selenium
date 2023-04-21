package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetTextAndGetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText ="Registration form";
        String actualHeaderText = headerText.getText();


        if(actualHeaderText.equals(expectedHeaderText))
        {
            System.out.println("Header text verification PASSED");
        }
        else
        {
            System.out.println("Header text verification FAILED");
        }

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder))
        {
            System.out.println("Placeholder text verification PASSED");
        }
        else
        {
            System.out.println("Placeholder text verification FAILED");
        }

        driver.close();
    }
}
