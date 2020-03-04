package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        /* test case1: login successfully
       1. go to Vytrack login page
       2. write username  data: storemanager52
       3. write password         UserUser123
       4. click login button
       5.Verify that the user is on the homepage

        test case2:

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        // verify that you are in the home page

        String expectedURL = "https://app.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();
        if(expectedURL.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedURL = " + expectedURL);
        }








    }
}
