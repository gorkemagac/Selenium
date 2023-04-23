package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

      WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        System.out.println("Checkbox 1 is selected, expecting false = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("Checkbox 2 is selected, expecting true = " + checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();

        System.out.println("Checkbox 1 is selected, expecting true = " + checkbox1.isSelected());
        System.out.println("Checkbox 2 is selected, expecting false = " + checkbox2.isSelected());



    }
}
