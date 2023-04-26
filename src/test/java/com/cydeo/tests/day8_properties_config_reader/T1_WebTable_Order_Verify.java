package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void order_name_verify_test()
    {
        driver.get("https://practice.cydeo.com/web-tables");
        WebElement bob = driver.findElement(By.xpath(" //table[@class='SampleTable']//tr[7]//td[2]"));
        String actualName = bob.getText();
        String expectedName = "Bob Martin";

        Assert.assertEquals(actualName,expectedName);

        WebElement orderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[5]"));
        String actualOrderDate = orderDate.getText();
        String expectedOrderDate = "12/31/2021";

        Assert.assertEquals(actualOrderDate,expectedOrderDate);
    }
    @Test

    public void test2(){
        driver.get("https://practice.cydeo.com/web-tables");

        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);

        String costumerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);
    }
    @Test
    public void test3()
    {
        driver.get("https://practice.cydeo.com/web-tables");

        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");
    }
}
