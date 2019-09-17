package Selenium;

import java.util.concurrent.TimeUnit;
import java.util.List;

import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class49 {
    public static void main(String[] args) throws  InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/");

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders Login")){
            System.out.println("Verification passed ");
        }
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']")).sendKeys("Tester");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']")).click();
        String title2 = driver.getTitle();
        if(title2.equalsIgnoreCase("Web Orders")){
            System.out.println("Verification passed ");
        }
        String url = driver.getCurrentUrl();
        if(url.equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/")){
            System.out.println("Url is good ");
        }else{
            System.out.println("The url is not found");
        }
    }
}