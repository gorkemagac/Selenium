package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/add_remove_elements/");

       WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//div[@id=\"elements\"]/button"));
        if(deleteButton.isDisplayed())
        {
            System.out.println("is displayed");
        }
        else
        {
            System.out.println("is not displayed");
        }

        deleteButton.click();

        try{
            System.out.println(deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e)
        {
            System.out.println("This means the web element is completely deleted");
        }

        driver.quit();
    }
}
