package Practice_Purpose;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.io.File;

public class Test {

    public static void main(String[] args) {




        String name = "Nurlan";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));

        }
    }
}
