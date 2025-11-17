package com.maheshmh.EX_09_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class JS_exe {
    @Test
    public void jstest() {

        //the use of javascript executor in selenium is to execute javascript code in the browser and perform actions that are not possible using standard selenium methods.
        // like scrolling, clicking hidden elements, changing element attributes, etc.
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement scrolltill = driver.findElement(By.xpath("//div[@id='userName']"));
        //Scroll down till element is found
        js.executeScript("arguments[0].scrollIntoView(true);", scrolltill);
// scrolli by pixed //clicking on element using js executor
        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollBy(0,500);");
        System.out.println("url is " + driver.getPageSource());
        System.out.println("page source is" + driver.getCurrentUrl());

    }
}
