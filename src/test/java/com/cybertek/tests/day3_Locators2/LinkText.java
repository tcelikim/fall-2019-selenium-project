package com.cybertek.tests.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //Locator-> LinkText

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().fullscreen();

        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));

        String textVersionOfExample3 = example3.getText();
        System.out.println(textVersionOfExample3);

//linkText vs partialLinkText
        //I want to locate Example3 with only a part of it
        WebElement example3_2 = driver.findElement(By.partialLinkText("Example 3:"));
        String text = example3_2.getText();
        System.out.println(text);


        //locate Cybertek_School
        WebElement cybertekSchool = driver.findElement(By.linkText("Cybertek School"));

        // I can't print the above variable cybertekschool. Because it is a webElement

        // in order to print  I need getText()

        String textVersion = cybertekSchool.getText();
        System.out.println(textVersion);

        //locate home
        WebElement home = driver.findElement(By.linkText("Home"));
        System.out.println(home.getText());


    }
}
