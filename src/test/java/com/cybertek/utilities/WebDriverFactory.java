package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // write a static return method which returns WebDriver
    // method name: getDriver
    // it takes a String as a parameter--> browser type
    //returns ChromeDriver and FirefoxDriver

    public static WebDriver getDriver(String browserType){
        WebDriver driver = null;
     if(browserType.equalsIgnoreCase("chrome")){
         WebDriverManager.chromedriver().setup();
         driver =new ChromeDriver();
     }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.chromedriver().setup();
            driver =new FirefoxDriver();
     }

        return driver;
    }


}
