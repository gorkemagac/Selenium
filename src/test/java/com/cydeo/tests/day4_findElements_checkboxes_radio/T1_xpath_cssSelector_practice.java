package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLinkCss = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLinkXpath = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgotPasswordTextCss = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement forgotPasswordTextXPath = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement emailTextCss = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailTextXpath = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputBoxCss = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement inputBoxXpath = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBoxXpath2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        WebElement retrievePasswordButtonCss = driver.findElement(By.cssSelector("button[id='form_submit']"));
        WebElement retrievePasswordButtonXpath = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoTextCss = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        WebElement poweredByCydeoTextXpath = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println(homeLinkCss.isDisplayed());
        System.out.println(homeLinkXpath.isDisplayed());
        System.out.println(forgotPasswordTextCss.isDisplayed());
        System.out.println(forgotPasswordTextXPath.isDisplayed());
        System.out.println(emailTextCss.isDisplayed());
        System.out.println(emailTextXpath.isDisplayed());
        System.out.println(inputBoxCss.isDisplayed());
        System.out.println(inputBoxXpath.isDisplayed());
        System.out.println(inputBoxXpath2.isDisplayed());
        System.out.println(retrievePasswordButtonCss.isDisplayed());
        System.out.println(retrievePasswordButtonXpath.isDisplayed());
        System.out.println(poweredByCydeoTextCss.isDisplayed());
        System.out.println(poweredByCydeoTextXpath.isDisplayed());

    }
}
