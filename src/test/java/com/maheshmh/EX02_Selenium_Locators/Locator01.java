package com.maheshmh.EX02_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locator01 {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("mahesh")
    @Test
    public void test_invalidlogin() throws InterruptedException {
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(op);
        driver.navigate().to("https://app.vwo.com");
        // driver.manage().window().nmaximize();
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        WebElement username = driver.findElement(By.xpath("//input[@id = 'login-username']"));
        username.sendKeys("admin@admin.com");
        // 2. Find the password inputbox and enter the password
        WebElement pass = driver.findElement(By.xpath("//input[@name= 'password']"));
        pass.sendKeys("1234");


// 3. Find the submit button and click on it.
        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();

// 4.wair for some time
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//5. Verify the error message

        WebElement msg = driver.findElement(By.id("js-notification-box-msg"));
        String errpr_msg = msg.getText();
        System.out.println("erros message is-->>" +errpr_msg);

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(errpr_msg, "Your email, password, IP address or location did not match");

        driver.quit();

    }

}
