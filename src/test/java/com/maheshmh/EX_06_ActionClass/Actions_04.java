package com.maheshmh.EX_06_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Actions_04 {

    @Test
    public void dragdrop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.xpath("//div[@id= 'column-a']"));
        WebElement to = driver.findElement(By.xpath("//div[@id= 'column-b']"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        act.dragAndDrop(from, to).build().perform();
        driver.quit();
    }
}
