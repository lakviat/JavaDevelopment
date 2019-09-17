package Selenium;

import apple.laf.JRSUIUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
        alert.dismiss();
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[3]/button")).click();
        alert.sendKeys("Sent");
        Thread.sleep(2500);
        driver.quit();


    }
}
