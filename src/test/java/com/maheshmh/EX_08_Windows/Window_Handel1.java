package com.maheshmh.EX_08_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_Handel1 {
    @Test

    public void winHandle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()= 'Click Here']")).click();

        Set<String> Allwindows = driver.getWindowHandles();// handelling the
        for (String win : Allwindows) {
            driver.switchTo().window(win);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("switched to new window");
                System.out.println("new title" + driver.getTitle());


            }
        }
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
