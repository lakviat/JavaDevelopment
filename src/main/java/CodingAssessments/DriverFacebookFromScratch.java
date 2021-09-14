package CodingAssessments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFacebookFromScratch {
    public static WebDriver driver;

    private DriverFacebookFromScratch(){}

    public static WebDriver getDriver(){

        if (driver==null){
            switch ("chrome"){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver =new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }

        driver.manage().window().maximize();
        return driver;

    }
}
