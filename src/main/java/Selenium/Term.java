package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Term {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.etsy.com");
        driver.findElement(By.xpath("//*[@id=\'search-query\']")).sendKeys("Term");
        driver.findElement(By.xpath("//*[@id=\'gnav-search\']/div/div[2]/button")).click();
        String title = driver.getTitle();
        if(title.contains("Term")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title wasn't found");
        }

    }
}
