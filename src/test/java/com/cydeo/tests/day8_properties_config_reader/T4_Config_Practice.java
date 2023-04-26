package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {


  /*  public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browserType = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/


    @Test
    public void google_search_test()
    {
        Driver.getDriver().get("https://www.google.com");

        WebElement acceptButton =  Driver.getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptButton.click();
        WebElement googleSearchBox =  Driver.getDriver().findElement(By.xpath("//input[@name ='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
        String actualTitle =  Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }


}
