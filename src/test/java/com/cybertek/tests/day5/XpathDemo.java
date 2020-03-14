package com.cybertek.tests.day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        //get browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open browser
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       WebElement button1 =driver.findElement(By.xpath("//button[@onclick='button1()']"));
       // start interacting with the element
        String txt = button1.getText();
        System.out.println(txt);

       WebElement button2 =driver.findElement(By.xpath("//h3/following-sibling::button[2]"));
        System.out.println(button2.getText());


       WebElement button3 =driver.findElement(By.xpath("//button[3]"));
        System.out.println(button3.getText());
       // or  System.out.println(driver.findElement(By.xpath("//button[3]")));

        WebElement button4 =driver.findElement(By.xpath("//div/button[4]"));
        System.out.println(button4.getText());


        WebElement button5 =driver.findElement(By.xpath("//button[.='Button 5']"));
        System.out.println(button5.getText());



        WebElement button6 =driver.findElement(By.xpath("//button[id@='disappearing_button']"));
        System.out.println(button6.getAttribute("innerHTML"));

        // if none of the works use outerHTML
        System.out.println(button6.getAttribute("outerHTML"));

    }
}
