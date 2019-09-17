package Arrays;
import java.util.Arrays;
public class Practice_Purpose6 {
    public static void main(String[] args) {
        String[] words = {"One", "two", "three", "four","Hello"};
        attach(words);
    }

    public static String [] attach(String[] arr) {
        String [] fewValues2 = {""};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                arr[i].equals(fewValues2);
                System.out.println(fewValues2);
            }

        }
        return fewValues2;
    }
}




