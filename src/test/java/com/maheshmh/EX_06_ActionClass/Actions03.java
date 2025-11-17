package com.maheshmh.EX_06_ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions03
{
    @Test
    public void act3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        Actions act = new Actions (driver);
        act.scrollByAmount(300,500).build().perform();
        act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
