package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class XpathPractice {
    public static void main(String[] args) {
        //go to practice login page
        // locate username box with absolute xpath
        // locate username box with relative xpath

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/login");
        // absolute
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input")).sendKeys("hello");


        //relative
        // tagName[@attribute= 'value']

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tanerxxxx"+ Keys.ENTER);
    }
}
