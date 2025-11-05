package com.maheshmh.SmallProject;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proj1 {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Test
    public void test_vwo_login_invalid_login() throws InterruptedException {

        // ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();

        WebElement input_inbox = driver.findElement(By.id("login-username"));
        input_inbox.sendKeys("admin@admin.com");

        WebElement pass_inbox = driver.findElement(By.name("password"));
        pass_inbox.sendKeys("a123");

        WebElement signin_button = driver.findElement(By.id("js-login-btn"));
        signin_button.click();
        Thread.sleep(300);

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String Text = error_msg.getText();
        System.out.println(Text);
        Thread.sleep(300);

        Assert.assertEquals(error_msg.getText(), "Your email, password, IP address or location did not match");
        driver.quit();

    }


}
