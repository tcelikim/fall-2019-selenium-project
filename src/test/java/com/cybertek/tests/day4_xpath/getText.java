package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().fullscreen();

        /* Task:

         */

        WebElement emailbox = driver.findElement(By.name("email"));
        emailbox.sendKeys("abc@gmail.com");

        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        submitBttn.submit();

        // verify that the confirmation text "Your e-mail's been sent!"
        String expectedText = "Your e-mail's been sent!";

        WebElement message = driver.findElement(By.name("confirmation_message"));

        //getText()-->
        String actualText = message.getText();
        if(expectedText.equals(actualText)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

        driver.close();



    }
}
