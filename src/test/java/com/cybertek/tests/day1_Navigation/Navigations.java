package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()

        */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // I want to see the full screen
        driver.manage().window().fullscreen();  // OR  driver.manage().window().maximize();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        // go to practice
        driver.get(practiceWebURL);
        Thread.sleep(3000);
        // go to google
        String gglURL = "http://google.com";
        driver.navigate().to(gglURL);

        // back to back
       driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        driver.navigate().refresh();

        //close drive
        // close the current browser ONLY
        driver.close();

        // close down all the windows in a browser
        driver.quit();




    }
}
