package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Homework11 {
    public static void main(String[] args) {
        // two types of methods one returns other one doesnt return
        int n = 5;
        int number = returnInteger(6);
        System.out.println(number);
        returnInteger(number);

    }

    public static int returnInteger (int number1) {
        System.out.println(number1);

        return number1 * 4;
    }}
    //

    //public static String concatenateStrings(String word1, String word2) {






