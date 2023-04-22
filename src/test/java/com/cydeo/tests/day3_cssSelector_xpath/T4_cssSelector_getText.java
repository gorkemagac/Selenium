package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

       WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResult = "Reset password";
        String actualResult= resetPasswordButton.getText();

        if(actualResult.equals(expectedResult))
        {
            System.out.println("Button Text verification PASSED");
        }
        else
        {
            System.out.println("Button Text verification FAILED");
        }



    }
}
