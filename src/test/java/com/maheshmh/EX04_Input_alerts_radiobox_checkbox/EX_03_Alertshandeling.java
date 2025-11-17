package com.maheshmh.EX04_Input_alerts_radiobox_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class EX_03_Alertshandeling {


    @Description("Alerts handelin")
    @Test
    public void testAlertsHandeling() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
// alert1
        WebElement al1 = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        al1.click();
        Thread.sleep(2000);
        String alt1txt = driver.switchTo().alert().getText();
        System.out.println("alert1 txt is-->" + alt1txt);
        driver.switchTo().alert().accept();

        // Alert 2

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement al2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        al2.click();
        String alrttxt = driver.switchTo().alert().getText();
        System.out.println("alert2 txt is-->" + alrttxt);
        driver.switchTo().alert().dismiss();

//alert3
        WebElement al3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        al3.click();
        String allert3 = driver.switchTo().alert().getText();
        System.out.println("alert3 txt is-->" + allert3);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().alert().sendKeys("acceptd");

        driver.switchTo().alert().accept();
        driver.quit();

    }
}
