package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class Test {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        searchBar.sendKeys("Yuliia Popelniak");
        Thread.sleep(2000);
        searchBar.click();

        WebElement clickbutton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
        clickbutton.click();

        WebElement frist_result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3/span"));
        Thread.sleep(1000);
        frist_result.click();
    }
}
