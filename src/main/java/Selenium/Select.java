package Selenium;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();


        // Absolute is single slash // single slash is a child // or that one direct child
        //Absolute looks for only a direct child, tries to locate from the DIRECT CHILD ONLY
        //Relative Xpath is a double slash // is used only for a relaitve xpath
        //starting from whenever you poiting

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");
        loginToSmartbear(driver);
        WebElement order = driver.findElement(By.xpath("//*[@id=\'ctl00_menu\']/li[3]/a"));
        order.click();
        WebElement product = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_ddlProduct\']"));

        product.click();











    }
    public static void loginToSmartbear(WebDriver driver){
        WebElement login = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']"));
        login.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_password\']"));
        password.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']"));
        loginBtn.click();

    }
    }



