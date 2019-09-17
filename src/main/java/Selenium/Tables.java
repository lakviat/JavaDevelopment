package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        WebElement username = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']"));
        login.click();



    }
        public static void TablesRunner (){
            System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
            WebElement username = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']"));
            username.sendKeys("Tester");
            WebElement password = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']"));
            password.sendKeys("test");
            WebElement login = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']"));
            login.click();
        }
        public void Runner(){
            System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
            WebElement username = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']"));
            username.sendKeys("Tester");
            WebElement password = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']"));
            password.sendKeys("test");
            WebElement login = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']"));
            login.click();
        }
        public void GetTable(){
            System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
            WebElement username = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']"));
            username.sendKeys("Tester");
            WebElement password = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']"));
            password.sendKeys("test");
            WebElement login = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']"));
            login.click();
            String title = driver.getTitle();
            System.out.println(title);



        }
}
