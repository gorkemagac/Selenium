package com.cydeo.tests.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonFirstProduct {
    @Test
    public void amazonFirstProduct() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com");
        WebElement inputBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        inputBox.sendKeys("selenium book"+ Keys.ENTER);

        WebElement firstResultPhoto = Driver.getDriver().findElement(By.xpath("//img[@class='s-image']"));
        WebElement firstResult = Driver.getDriver().findElement(By.xpath("(//h2[contains(class,a-link-normal)])[1]"));
        System.out.println("Product title = " + firstResult.getText());
        firstResultPhoto.click();



       WebElement firstProductReview = Driver.getDriver().findElement(By.id("acrCustomerReviewText"));
        System.out.println("Product Review = " + firstProductReview.getText());

        WebElement firstProductPrice = Driver.getDriver().findElement(By.id("price"));
        System.out.println("Product Price = " + firstProductPrice.getText());

        Driver.getDriver().quit();

    }
}
