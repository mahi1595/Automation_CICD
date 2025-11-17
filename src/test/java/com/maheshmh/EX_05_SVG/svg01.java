package com.maheshmh.EX_05_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class svg01 {

    @Description("normal svg test")
    @Test
    public void test_svg() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement data = driver.findElement(By.xpath("//input[@name='q']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        data.sendKeys("macmini");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        List<WebElement> ele = driver.findElements(By.xpath("//*[name()='svg']"));
        ele.get(0).click();
        List<WebElement> result = driver.findElements(By.xpath("//a[@class= 'wjcEIp']"));
        for (WebElement titl : result) { // using for-each loop to print all title
            //System.out.println("printing size " + titl.getSize());
            System.out.println("printing all matching titles" + titl.getText());
        }
// getting title from all pages until the next  button is visible
/*
        WebElement nxtbtn = driver.findElement(By.xpath("//span[text()= 'Next']"));
        while (nxtbtn.isDisplayed()) {
            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();

            WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(3)).
                    until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class= 'wjcEIp']")));

            List<WebElement> alltitle = driver.findElements(By.xpath("//a[@class= 'wjcEIp']"));

            for (WebElement titl : alltitle) {
                if (titl.getText() != null) {
                    System.out.println("all title ---->" + titl.getText());
                }
            }
        }

 */


    }


}
