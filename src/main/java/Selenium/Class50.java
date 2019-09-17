package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class50 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        negativeLoging(driver, "Tester", "Tester");

        negativeLoging(driver, "John", "hell");

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']")).click();

        WebElement error = driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_status\']"));

        if (error.isDisplayed()) {
            System.out.println("Error matched");
        } else {
            System.out.println("Errors not matched");

        }
    }

    public static void negativeLoging(WebDriver driver, String usernameValue, String passwordValue) {
        WebElement username1 = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        username1.clear();
        username1.sendKeys(usernameValue);
        password.clear();
        password.sendKeys(passwordValue);
        loginBtn.click();


        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
        if (errorMessage.getText().equals("Invalid Login or Password.")) {
            System.out.println("Error message verification PASSED");
        } else {
            System.out.println("Error message verification FAILED");

        }
    }
}
