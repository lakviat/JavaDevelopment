package Selenium;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();
        Specialized(driver);
    }

    public static void Specialized(WebDriver driver) {

        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\'lst-ib\']")).sendKeys("specialized.com");
        driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[3]/center/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/ul/li[3]/a")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'gigya-loginID-6701410220811095\']")).sendKeys("lakviat@yahoo.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id=\'gigya-password-38995288130494696\']")).sendKeys("Castadiv259683");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'gigya-login-form\']/div/div[1]/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[5]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[5]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\'input_SearchBoxComponent\']")).sendKeys("Specialized Epic");
        driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[5]/div[2]/div/div/form/button")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
        driver.get("http://google.com");
        driver.findElement(By.xpath("//*[@id=\'lst-ib\']")).sendKeys("yahoo.com");


        driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[3]/center/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("This work will end soon");
        driver.quit();

    }

}
