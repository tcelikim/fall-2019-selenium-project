package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        /*
                Task:
        Go to amazon  https://www.amazon.com/
         Go to Ebay   https://www.ebay.com/
        Enter a search term
        Click on search button
        Verify title contains search term

         */

        //locators-->ID, name<, classname
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("amazon.com/");
        driver.navigate().to("http://www.ebay.com/");

       WebElement searcBox = driver.findElement(By.name("_nkw"));
       searcBox.sendKeys("shoes"+ Keys.ENTER);

      // WebElement searchBttn = driver.findElement(By.id("gh-btn"));
      // searcBox.click();



        //Verify title contains search term



    }
}
