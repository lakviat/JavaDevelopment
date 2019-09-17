package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.Random;
public class CustomData {
    public static void main(String[] args) {
        String names = "Nurlan Dzhunushaleiv Mirovich Hello";
        generateUsername(names);

        String names2 = "What is going on witht the wolrd";
        renaomString(names2);

    }



    public static String generateUsername(String name) {
        name = name.replaceAll(" ", "");
        Random r = new Random();
        name = name + r.nextInt(100);
        return name.toLowerCase();

    }

    public static String renaomString(String names) {

        Random ran = new Random();

        StringBuilder newstring = new StringBuilder();
        newstring.append(names);
        newstring = newstring.reverse();
        System.out.println(newstring.toString().toLowerCase());
        return names;
    }
}



