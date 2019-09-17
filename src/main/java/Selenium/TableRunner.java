package Selenium;

import Complete_Ones.Duplicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRunner extends Tables {
    public static void main(String[] args) throws InterruptedException{

        Tables t = new Tables();
        t.GetTable();


        Specialized n = new Specialized();

        Duplicate dup = new Duplicate();
        int [] numbers = {10,20,30,40,};
        dup.duplicates(numbers);





    }
}
