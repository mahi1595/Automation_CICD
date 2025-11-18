package com.maheshmh.EX_11_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativecpath2 {

    @Test

    public void relatiuvexpath2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).
                sendKeys("india" + Keys.ENTER);


List<WebElement> cities = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
for(WebElement location : cities){
    String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
    String cityname = location.getText();

System.out.println("| " + rank + " | " + cityname + " |");

}
        List <WebElement> ststus = driver.findElements(By.xpath("//div[contains(@class,\"aqi-status\")]"));
for (WebElement locations : ststus){
    String status = locations.getText();
System.out.println(" | " + status + " | ");
}

    }
}
