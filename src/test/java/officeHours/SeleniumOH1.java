package officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH1 {
    public static void main(String[] args) {
        /*
        id - unique (it is not always available) -
        class -classname
        name
        tag - every element will have a tag

        will only work with the link
        linktext
        partial linktext
        that is using html(syntax)
        locator
        css
        xpath


         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");

        WebElement search_Box = driver.findElement(By.id("search_query_top"));

        //WebElemrnt class in selenium/java and it has many useful methods
        //.sendKeys("value that we want to send -input tag")
        search_Box.sendKeys("tshirt" + Keys.ENTER);


    }

}
