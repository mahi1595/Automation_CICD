package com.maheshmh.EX04_Input_alerts_radiobox_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Static_dropdown {

    @Description ("Static dropdown handelling")
    @Test
    public void dropdown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.getTitle();
        driver.manage().window().maximize();

       WebElement dropdow =  driver.findElement(By.xpath("//select[@id='dropdown']"));
        dropdow.click();
        Select  selectdropdwn = new Select(dropdow);
        selectdropdwn.selectByIndex(0);
    }
}




