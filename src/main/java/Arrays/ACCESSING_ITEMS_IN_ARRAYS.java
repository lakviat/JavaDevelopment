package Arrays;

import Complete_Ones.Febonachi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;

public class ACCESSING_ITEMS_IN_ARRAYS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Select dropdown = new Select(driver.findElement(By.name("Hel")));

        String[] brands = new String[]{"Hello", "What", "Apple", "GALXY", "Zara", "Nike"};
        String contain = "";
        for (int i = 0; i < brands.length; i++) {
            if (brands[i].contains("e")) {
                contain = contain + brands[i] + " ";
            }

        }


        contain.split(" ");
        System.out.println(contain);
    }

}





