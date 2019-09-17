package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config {

   static Properties pro;

    static{
        String path = "Configurations.proporties";
        try {
            FileInputStream file = new FileInputStream(path);
            pro = new Properties();
            pro.load(file);
            file.close();
        } catch(Exception e){
            System.out.println("Path : " + path + " - not found .");
        }
    }

    public static void main(String[] args) {
        String s = pro.getProperty("name");
        System.out.println(s);
    }
}
