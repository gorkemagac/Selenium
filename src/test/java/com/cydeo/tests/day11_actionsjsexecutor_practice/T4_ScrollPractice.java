package com.cydeo.tests.day11_actionsjsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ScrollPractice {

    @Test
    public void scrollPractice()
    {
        Driver.getDriver().get("https://practice.cydeo.com/ ");

        Actions actions = new Actions(Driver.getDriver());

        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        actions.moveToElement(poweredByCydeo).perform();



    }
}
