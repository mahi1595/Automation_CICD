package com.maheshmh.EX04_Input_alerts_radiobox_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class EX_02_Static_dropdown {

    @Description("Static dropdown handelling")
    @Test
    public void dropdown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.getTitle();
        driver.manage().window().maximize();

        WebElement dropdow = driver.findElement(By.xpath("//select[@id='dropdown']"));
        dropdow.click();
        Select selectdropdwn = new Select(dropdow);
        selectdropdwn.selectByIndex(1);
        String Selectedoption = selectdropdwn.getFirstSelectedOption().getText();
        System.out.println("selected option is:-" + Selectedoption);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dropdow.click();
        Thread.sleep(3000);
        selectdropdwn.selectByVisibleText("Option 2");
        String newoption = selectdropdwn.getFirstSelectedOption().getText();
        System.out.println("new option is:- " + newoption);
        driver.quit();
    }
}







