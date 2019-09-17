package Complete_Ones;
import java.util.Scanner;
public class ReverseStringArray {
    public static void main(String[] args) {
    //Arrays
        String [] words = {"Hello", "world", "Hi", "Kill" };
        String reversed = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words.length -1; j >=0 ; j--) {
                reversed = reversed + " " +words[j];


            }

        }

        System.out.println(reversed + " ");
    }
}












