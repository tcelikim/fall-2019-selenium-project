package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {
        /*
        go to password page
        locate retrieve password bttn
        print out submit value
               type='submit'
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().fullscreen();

        WebElement retrievePasswordBttn = driver.findElement(By.id("form_submit"));
       // <button id="form_submit" class="radius" type="submit"><i class="icon-2x icon-signin">Retrieve password</i></button>
        System.out.println(retrievePasswordBttn.getAttribute("type")); //submit
        System.out.println(retrievePasswordBttn.getAttribute("class")); //radius

    }
}
