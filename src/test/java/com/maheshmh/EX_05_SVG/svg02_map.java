package com.maheshmh.EX_05_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class svg02_map {
    @Test

    public void india_svg() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        List<WebElement> ele = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for (WebElement allstates : ele) {
            String statename = allstates.getDomAttribute("aria-label");
            System.out.println("all states in india are:- " + statename);
            if (statename.contains("Tripura")) {
                allstates.click();
                System.out.println("clicked on the tripura ");
            }
            driver.quit();

        }
    }


}
