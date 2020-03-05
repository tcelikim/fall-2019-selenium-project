package com.cybertek.tests.day2_Locators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Tekrar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");
        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));
        emailBox.sendKeys("abc@gmail.com");

        driver.findElement(By.id("okta-signin-password")).sendKeys("124");
    }
}
