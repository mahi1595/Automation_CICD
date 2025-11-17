package com.maheshmh.EX_06_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action02 {

    @Test
    public void actioncalss02() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebElement fromdata = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
        WebElement todata = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(fromdata).click().sendKeys("BLR").build().perform();
        Thread.sleep(2000);
        act.moveToElement(todata).click().sendKeys("DEL").build().perform();
        driver.quit();

    }
}
