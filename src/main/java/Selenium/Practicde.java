package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicde {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        WebElement register = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        register.click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).click();


    }
}
