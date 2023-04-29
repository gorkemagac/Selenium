package com.cydeo.tests.day11_actionsjsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JavascriptExecutor {
    @Test
    public void scroll_JavascriptExecutor()
    {
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        WebElement home = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", poweredByCydeo);
        js.executeScript("arguments[0].scrollIntoView(true);", home);



    }
}
