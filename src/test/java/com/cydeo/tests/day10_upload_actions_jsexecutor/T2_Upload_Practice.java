package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test()
    {
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path="C:/Users/gorke/Pictures/Iphone Photos/CXAR7449.JPG";

        WebElement fileUpload =Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

       WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());


    }

}
