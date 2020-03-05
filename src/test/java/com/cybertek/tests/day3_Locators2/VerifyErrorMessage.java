package com.cybertek.tests.day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {
        /*
            1.go to login page
            2. enter invalid username
            3. enter invalid password
            4. verify the error message
         */

        // testers will gather test data in excell sheet
        //generate data from dummy data website
        // java faker


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().fullscreen();

        Faker faker = new Faker();
        String username = faker.name().fullName();
        String password = faker.app().author();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("wooden_spoon")).click();


        driver.close();




    }
}
