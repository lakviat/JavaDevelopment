package Arrays;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class Practice_Purpose {
    public static void main(String[] args) {
    int [] numbers = {10,20,30,40};
        add(numbers);


        String [] word = {"Hello", "John", "Eric", "Mike"};
        add(word);


        int [] maindot = {10,20,30,40,50};
        dot(maindot);

    }

    public static int[] add(int[] a) {
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + ",");
            }


        return a;
    }


        public static String [] add(String [] stringcoma){
            for (int i = 0; i < stringcoma.length ; i++) {
                System.out.print(stringcoma[i] + ", ");

            }
        return stringcoma;

    }
        public static int [] dot (int [] input) {
            int size = input[input.length -1];
            for (int i = 0; i < input.length; i++) {
                if (size != input[i]) {
                    System.out.print(input[i] + ", ");
                } else {
                    System.out.print(input[i] + ". ");
                }

            }
            return input;
        }
}










































































