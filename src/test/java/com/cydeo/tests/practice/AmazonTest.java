package com.cydeo.tests.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonTest {

    @Test
    public void test()
    {
        Driver.getDriver().get("https://www.amazon.com.tr");
        WebElement cookies = Driver.getDriver().findElement(By.id("sp-cc-accept"));
        cookies.click();

        WebElement inputBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        inputBox.sendKeys("iphone13 512" + Keys.ENTER);

        WebElement firstPhone = Driver.getDriver().findElement(By.xpath(" (//img[@class='s-image'])[1]"));
        firstPhone.click();

        WebElement iphone = Driver.getDriver().findElement(By.xpath("(//div[@class='content-grid-block']//h3)"));
        WebElement size = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[1]"));
        WebElement color = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        WebElement price = Driver.getDriver().findElement(By.xpath("((//span[@class='a-price-whole'])[1])"));
        WebElement stockAvailability = Driver.getDriver().findElement(By.xpath("((//div[@id='availability']//span))"));


        System.out.println(iphone.getText() + " Size: " + size.getText());
        System.out.println("Color: " + color.getText() + "  Price: " + price.getText()+" TL");
        System.out.println("Stock: " + stockAvailability.getText());

    }
}
