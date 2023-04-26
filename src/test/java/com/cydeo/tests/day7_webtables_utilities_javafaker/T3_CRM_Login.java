package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_Login extends TestBase {


  @Test
    public void crm_login_test()
    {
        driver.get("https://login1.nextbasecrm.com");
        WebElement username =  driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk1@cybertekschool.com");

        WebElement password =  driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

       WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();

        BrowserUtils.verifyTitle(driver,"My tasks");

    }
    @Test

    public void crm_login_test_2(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com","UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "(1) Portal");

    }

}
