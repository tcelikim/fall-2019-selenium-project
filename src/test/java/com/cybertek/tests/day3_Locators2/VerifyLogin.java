package com.cybertek.tests.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        /*
        go to login page
        enter username
        enter password
        click login buttonare done
        verify the welcome message" Welcome to the Secure Area. When you are done click logout below"
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("tomsmith");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword"); //boyle de yazabiliriz yukaridaki gibi de
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));

        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        // String vs WenElement
        // getText() --> convert WebElement to String
        String actualWelcomeMessage = welcomeMessage.getText();
        if(expectedMessage.equals(actualWelcomeMessage)){
            System.out.println("PASSS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();


    }
}
