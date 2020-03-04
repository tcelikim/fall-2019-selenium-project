package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to Cybertek practice web site
        2. verify title expected title

        http://practice.cybertekschool.com/

         */
        // connect browser and driver
        // setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        driver .manage().window().maximize();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected " +expectedTitle);
            System.out.println("The actual title is " +actualTitle);
        }

        Thread.sleep(3000);

     driver.close();

    }
}
