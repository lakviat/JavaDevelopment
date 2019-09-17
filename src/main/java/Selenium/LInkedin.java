package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkedin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        driver.findElement(By.xpath("//*[@id=\'login-email\']")).sendKeys("nurlanmirovich@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\'login-password\']")).sendKeys("Nurlan259683");
        driver.findElement(By.xpath("//*[@id=\'login-submit\']")).click();
        driver.findElement(By.xpath("//*[@id=\'mynetwork-tab-icon\']")).click();
        driver.findElement(By.xpath("//*[@id=\'nav-settings__dropdown-trigger\']/div")).click();
        driver.findElement(By.xpath("//*[@id=\'ember668\']")).click();


        Thread.sleep(2000);
        driver.close();

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("docment.getElementById('email').value='krishna@=gmail.com");


    }
}
