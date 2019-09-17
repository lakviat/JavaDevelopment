package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {


            driver = new ChromeDriver();
            return driver;
        }
    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
        return driver;


    }
    }
