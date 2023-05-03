package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleVerfication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        driver.get("https://amazon.com");

        driver.findElement(By.name("field-keywords")).sendKeys("Iphone Case" + Keys.ENTER);

       WebElement productLink =  driver.findElement(By.xpath("//*[@data-image-index ='1']"));
        productLink.click();

        WebElement addToCart =  driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        WebElement proceedToCheckout =  driver.findElement(By.name("proceedToRetailCheckout"));
        proceedToCheckout.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Sign";

        if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Title Verification PASSED");
        }
        else
        {
            System.out.println("Title Verification FAILED");

        }
    }
}
