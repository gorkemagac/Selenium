package com.cydeo.tests.day11_actionsjsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T5_ScrollPractice2 {
    @Test
    public void scrollPractice2()
    {
        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(poweredByCydeo).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

    }
}
