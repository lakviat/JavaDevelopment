package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class Specialized {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
        WebDriver driver = new ChromeDriver();

//        WebElement username = driver.findElement(By.name("userName"));
//        WebElement password = driver.findElement(By.name("password"));
        driver.get("https://www.specialized.com/us/en");
//        String title = driver.getTitle();
//        if(title.contains("Specialized")){
//            System.out.println(title);
//        }else {

            //getAttributes allows you to find the size of a special attribute in html code
            //driver.findElement(username.getAttribute())
            //getText return any text that is outside of the diamond brackets,
            //getAttribute return the value of given Attribute

            Thread.sleep(2000);
            driver.navigate().back();
            driver.navigate().forward();
            driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[3]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'gigya-loginID-6701410220811095\']")).sendKeys("lakviat@yahoo.com");
            driver.findElement(By.xpath("//*[@id=\'gigya-password-38995288130494696\']")).sendKeys("Castadiv259683");
            driver.findElement(By.xpath("//*[@id=\'gigya-login-form\']/div/div[1]/div[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\'navigation\']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[3]/div/div[6]/div[2]/div/ul/li[2]/div/form/label")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[3]/div/div[8]/div[2]/div/ul/li[4]/div/form/label")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[4]/div[16]/div/a/div")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[4]/div[1]/div/a/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'productDataOptions\']/div[3]/div/div/div[2]/div/div[2]/select")).click();
            driver.findElement(By.xpath("//*[@id=\'findNearbyBtn\']")).click();
            driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[4]/a")).click();
            driver.navigate().back();
            WebElement username = driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/ul/li[3]/a"));
            username.click();
            driver.manage().deleteAllCookies();

            driver.quit();

        }
        public void Specialized (String name) throws InterruptedException{
            System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/New/chromedriver");
            WebDriver driver = new ChromeDriver();
//        WebElement username = driver.findElement(By.name("userName"));
//        WebElement password = driver.findElement(By.name("password"));
            driver.get("https://www.specialized.com/us/en");
//        String title = driver.getTitle();
//        if(title.contains("Specialized")){
//            System.out.println(title);
//        }else {

            //getAttributes allows you to find the size of a special attribute in html code
            //driver.findElement(username.getAttribute())
            //getText return any text that is outside of the diamond brackets,
            //getAttribute return the value of given Attribute

            Thread.sleep(2000);
            driver.navigate().back();
            driver.navigate().forward();
            driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[3]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'gigya-loginID-6701410220811095\']")).sendKeys("lakviat@yahoo.com");
            driver.findElement(By.xpath("//*[@id=\'gigya-password-38995288130494696\']")).sendKeys("Castadiv259683");
            driver.findElement(By.xpath("//*[@id=\'gigya-login-form\']/div/div[1]/div[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\'navigation\']/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[3]/div/div[6]/div[2]/div/ul/li[2]/div/form/label")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[3]/div/div[8]/div[2]/div/ul/li[4]/div/form/label")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[4]/div[16]/div/a/div")).click();
            driver.findElement(By.xpath("//*[@id=\'content\']/div[6]/div[1]/div[4]/div[1]/div/a/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'productDataOptions\']/div[3]/div/div/div[2]/div/div[2]/select")).click();
            driver.findElement(By.xpath("//*[@id=\'findNearbyBtn\']")).click();
            driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div[4]/a")).click();
            driver.navigate().back();
            WebElement username = driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/ul/li[3]/a"));
            username.click();
            driver.manage().deleteAllCookies();
            driver.quit();

        }
}

