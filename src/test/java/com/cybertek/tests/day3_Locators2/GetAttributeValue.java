package com.cybertek.tests.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().fullscreen();

        //I want to get the value of type attribute
        // type ="text"--> getAttribute("attribute name")

        //locate username box
        WebElement userName = driver.findElement((By.name("username")));

        //<input type="text" name="username">
        String valueOfType = userName.getAttribute("type");
        System.out.println("valueOfType = " + valueOfType);

        //<input type="password" name="password">
        // type="password" -> type is attribute and password is value of attribute.

        WebElement password = driver.findElement(By.name("password"));
        String valueOfType_password = password.getAttribute("type");
        System.out.println("valueOfType_password = " + valueOfType_password);

        // <button class="btn btn-primary" type="submit" id="wooden_spoon">
        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));

       // I want to print class attribute value
        System.out.println(loginbttn.getAttribute("class"));

    }
}
