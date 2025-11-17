package com.maheshmh.EX_06_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Action01_ {

    @Test
    public void actionchjeck() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        ele.sendKeys("mahesh mh");
        Actions act = new Actions(driver);
        act.keyDown(Keys.SHIFT).sendKeys(ele, "hasabe").keyUp(Keys.SHIFT).build().perform();


    }
}
