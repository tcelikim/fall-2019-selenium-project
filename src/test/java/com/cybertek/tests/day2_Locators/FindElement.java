package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");
        driver.manage().window().maximize();

       Thread.sleep(5000);
       WebElement emailBox= driver.findElement(By.id("okta-signin-username"));
       emailBox.sendKeys("tcelikim@gmail.com");


       // write your password to the text box
        Thread.sleep(5000);
        driver.findElement(By.id("okta-signin-password")).sendKeys("123abc");
    }
}
