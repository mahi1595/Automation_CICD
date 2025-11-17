package com.maheshmh.EX03_locators;

import com.maheshmh.Util.Commontoall;
import io.qameta.allure.Description;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class login_health extends Commontoall {


    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test(priority = 2)
    public void test_login_health() {
        WebDriver driver = new ChromeDriver();
        //openbrowser(driver, "https://healthunify.com/bmicalculator/"); //
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//   step1
        WebElement making_appointmewnt = driver.findElement(By.xpath("//a[@id= 'btn-make-appointment']"));
        making_appointmewnt.click();

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txt-username']"));
        WebElement pass = driver.findElement(By.xpath("//input[@id = 'txt-password']"));
        username.sendKeys("John Doe");
        pass.sendKeys("ThisIsNotAPassword");
        WebElement login = driver.findElement(By.xpath("//button[@id = 'btn-login']"));
        login.click();
        System.out.println("curemt url-->" + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        close_browser(driver);
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
       String alerttxt= alert.getText();
       System.out.println("alert msg is" + alerttxt);
       //alert.accept();

        //Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        //close_browser(driver);

         */

    }

    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test(priority = 1)
    public void test_invalidlogin_health() {
        WebDriver driver = new ChromeDriver();
        //  openbrowser(driver, "https://katalon-demo-cura.herokuapp.com/"); //
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
//   step1
        WebElement making_appointmewnt = driver.findElement(By.xpath("//a[@id= 'btn-make-appointment']"));
        making_appointmewnt.click();

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txt-username']"));
        WebElement pass = driver.findElement(By.xpath("//input[@id = 'txt-password']"));
        username.sendKeys("abc");
        pass.sendKeys("123");
        WebElement login = driver.findElement(By.xpath("//button[@id = 'btn-login']"));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement error_msg = driver.findElement(By.xpath("//p[@class='lead text-danger']"));

        String errors_message = error_msg.getText();
        System.out.println("error message is -->" + errors_message);
        Assert.assertEquals(errors_message, "Login failed! Please ensure the username and password are valid.");
        close_browser(driver);

    }
}
