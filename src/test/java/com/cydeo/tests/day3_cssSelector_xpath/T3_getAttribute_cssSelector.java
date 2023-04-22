package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
      //  WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
      //  WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));



        String expectedButtonText = "Log In";
        String actualButtonText = loginButton.getAttribute("value");

        if(actualButtonText.equals(expectedButtonText))
        {
            System.out.println("Button Text verification PASSED");
        }
        else
        {
            System.out.println("Button Text verification FAILED");
        }


    }
}
