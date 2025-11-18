package com.maheshmh.EX_11_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relative1 {
    @Test
    public void relativexpath() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.switchTo().frame("result");
        Thread.sleep(2000);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(3)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        WebElement usrnm = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement pss = driver.findElement(with(By.tagName("input")).below(usrnm));
        pss.click();
        pss.sendKeys("mahe");
        driver.findElement(By.xpath("//form[@id='form']/button")).click();
        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(usrnm));
        System.out.println("all error message are----" + error_msg.getText());

        driver.quit();
    }

}
