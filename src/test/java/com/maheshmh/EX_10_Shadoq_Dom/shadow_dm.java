package com.maheshmh.EX_10_Shadoq_Dom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class shadow_dm {

// the shadow dom is used to create web components that are encapsulated and isolated from the main document DOM. This allows developers to create reusable components with their own styles and behavior without affecting the rest of the page.
    // meaning of shadow dom is a web standard that allows developers to create encapsulated and isolated DOM trees within a web page.


    @Test
    public void test_shadow_dom() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputpizzza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputpizzza.sendKeys("pizza");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       WebElement inutname = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('#kils');");
       inutname.sendKeys("mahesh");
       driver.quit();
    }


}
