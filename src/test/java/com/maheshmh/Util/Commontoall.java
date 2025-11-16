package com.maheshmh.Util;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Commontoall {

    public WebDriver driver ;
public  void openbrowser (WebDriver drivr, String url){
driver.get(url);
driver.manage().window().maximize();
}
public void close_browser (WebDriver driver){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.quit();
}

}
