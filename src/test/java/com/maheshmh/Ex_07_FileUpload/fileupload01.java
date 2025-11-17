package com.maheshmh.Ex_07_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class fileupload01 {


    @Test
    public void fileuploa() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement upload = driver.findElement(By.xpath("// input [@id ='fileToUpload']"));
// need to give user directory
        String userdir = System.getProperty("user.dir"); // location of user directory
        //String filepath = userdir + "/src/test/java/com/maheshmh/Ex_07_FileUpload/test.txt";
        String filepath2 = "C:/Users/Admin/Downloads/file.txt";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        upload.sendKeys(filepath2);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("// input [@name='submit']")).click();
        driver.quit();
    }
}
