package com.maheshmh.EX_13_DataDriven;

import com.maheshmh.Util.UtilExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.time.Duration;

@Test(dataProvider = "getdata")
public class EX_04_DataDrivern_Realtime {
    public void vwo_login(String username, String password) throws InterruptedException {
      //  ChromeOptions options = new ChromeOptions();
     //  options.addArguments("headless");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        //        // 1) Simple split (escape pipe)
//        String[] parts1 = password.split("\\|");
//        System.out.println("parts1[0] = '" + parts1[0] + "'");
//        System.out.println("parts1[1] = '" + parts1[1] + "'");


        WebElement usernm = driver.findElement(By.xpath("//input[@name = 'username']"));
        usernm.sendKeys(username);
        WebElement pwd = driver.findElement(By.xpath("//input[@name = 'password']"));
        pwd.sendKeys(password);
        driver.findElement(By.xpath("//button[@id= 'js-login-btn']")).click();

        WebElement err_msg = driver.findElement(By.className("notification-box-description"));
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));
        System.out.println("error messgae is --/" + err_msg.getText());

        Assert.assertEquals(err_msg.getText(), "Your email, password, IP address or location did not match");
        driver.quit();

    }


    @DataProvider
    public Object[][] getdata() {
        return UtilExcel.getdatafromExcel("Sheet1");
    }
}
