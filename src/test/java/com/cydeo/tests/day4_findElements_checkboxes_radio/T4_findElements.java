package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");
        List<WebElement> allLink = driver.findElements(By.tagName("a"));

        System.out.println("Number of Links = " + allLink.size());

        for (WebElement each : allLink)
        {
            System.out.println("Text of Link: " + each.getText());
            System.out.println("HREF Values : " + each.getAttribute("href"));
        }


       /* WebElement homeLinkCss = driver.findElement(By.cssSelector("a[class='nav-link']"));
       // WebElement homeLinkXpath = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println("homeLinkCss.getText() = " + homeLinkCss.getText());
        System.out.println("homeLinkCss.getAttribute(\"href\") = " + homeLinkCss.getAttribute("href"));

        WebElement cydeoButtonCss = driver.findElement(By.cssSelector("a[target='_blank']"));
        // WebElement cydeoButtonXpath = driver.findElement(By.xpath("//a[@a[target='_blank']"));
        System.out.println("cydeoButtonCss.getText() = " + cydeoButtonCss.getText());
        System.out.println("homeLinkCss.getAttribute(\"href\") = " + cydeoButtonCss.getAttribute("href"));*/

    }

}
