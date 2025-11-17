package com.maheshmh.EX04_Input_alerts_radiobox_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class EX_04_Modal {

    @Description("modal verification")
    @Test
    public void modaltest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section [@class= 'modalMain tcnFooter']")));
        ele.click();
        WebElement closemodal = driver.findElement(By.xpath("//span[@class= 'commonModal__close']"));
    closemodal.click();


driver.quit();

    }
}
