package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookitURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in ");
        driver.manage().window().maximize();
        String expectedPartialURL ="cybertek-reservation";
        String actualURL =driver.getCurrentUrl();

        if(actualURL.contains(expectedPartialURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualURL = " + actualURL);
            System.out.println("expectedPartialURL = " + expectedPartialURL);
        }
        driver.close();
    }
}
