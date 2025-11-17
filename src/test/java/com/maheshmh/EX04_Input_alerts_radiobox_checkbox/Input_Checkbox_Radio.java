package com.maheshmh.EX04_Input_alerts_radiobox_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Input_Checkbox_Radio {


    @Description("Check all checkboz and radio button")
    @Test

    public void allvalidation() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //input
        WebElement firstnm = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstnm.sendKeys("mahesh");
        WebElement lastnm = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastnm.sendKeys("maruti");

        //radio button
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='exp-0']"));
        radiobtn.click();


// checkbox
        WebElement checkbx = driver.findElement(By.xpath("//input[@id='profession-0']"));
        checkbx.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.quit();


    }

}
