package Complete_Ones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/node_modules/chromedriver/bin");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.newtours.demoaut.com/");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//input[@name='login']")).click();

        //select Type "Round Trip"
        WebElement selectTypeLocator1 = driver.findElement(By.xpath("//input[@value='roundtrip']"));
        selectTypeLocator1.click();
        System.out.println("Flight details: ");
        //verify Round Trip
        if (selectTypeLocator1.isSelected()) {
            System.out.println("Type: Round trip  - is selected & checked");
        }
        //verify One way
        WebElement selectTypeLocator2 = driver.findElement(By.xpath("//input[@value='oneway']"));
        if (!selectTypeLocator2.isSelected()) {
            System.out.println("Type: One way  - is unchecked");
        }

        //select Passengers (2)
        WebElement selectPassengersLocator = 		driver.findElement(By.xpath("//select[@name='passCount']"));
        Select selectPassengers = new Select(selectPassengersLocator);
        selectPassengers.selectByValue("2");

//		// verify passengers
        //	String str1="2";
        if (selectPassengersLocator.equals(2)) {
            System.out.println("Passengers: " + "2");
        } else {
            System.out.println("Passengers did not selected");
        }

        //select Departing From "Paris"
        WebElement selectDepartingFromLocator = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select selectDepartingFrom = new Select(selectDepartingFromLocator);
        selectDepartingFrom.selectByValue("Paris");
        //verify Departing From
        if (selectDepartingFrom.equals("Paris")) {

        } else {

        }
        //select On "December 24"
        WebElement selectOnFromMonthLocator = driver.findElement(By.xpath("//select[@name='fromMonth']"));
        WebElement selectOnFromDayLocator = driver.findElement(By.xpath("//select[@name='fromDay']"));
        Select selectOnFromMonth = new Select(selectOnFromMonthLocator);
        Select selectOnFromDay = new Select(selectOnFromDayLocator);
        selectOnFromMonth.selectByValue("12");
        selectOnFromDay.selectByValue("24");

        //select Arriving In "Seattle"
        WebElement selectArrivingInLocator = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select selectArrivingIn = new Select(selectArrivingInLocator);
        selectArrivingIn.selectByValue("Seattle");

        //select Returning "December 30"
        WebElement selectReturningToMonthLocator = driver.findElement(By.xpath("//select[@name='toMonth']"));
        WebElement selectReturningToDayLocator = driver.findElement(By.xpath("//select[@name='toDay']"));
        Select selectReturningToMonth = new Select(selectReturningToMonthLocator);
        Select selectReturningToDay = new Select(selectReturningToDayLocator);
        selectReturningToMonth.selectByValue("12");
        selectReturningToDay.selectByValue("30");

        //select Service Class "Business Class"
        WebElement selectServiceClassLocator = driver.findElement(By.xpath("//input[@value='Business']"));
        selectServiceClassLocator.click();

        //select Airline "United Airlines"
        WebElement selectAirlineLocator = driver.findElement(By.xpath("//select[@name='airline']"));
        Select selectAirline = new Select(selectAirlineLocator);
        selectAirline.selectByValue("Unified Airlines");

    }

}



