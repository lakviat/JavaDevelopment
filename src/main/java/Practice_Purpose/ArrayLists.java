package Practice_Purpose;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
            int max = 0;
            int min = 0;
            int [] numbers = {10,3,3,3,40,40,0,};
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] > min){
                min = numbers[i];

                String hell = "Hello";
                String word = "Hello wordl ";

                System.out.println(word.substring(0,3));


            }

        }
        System.out.println( min);
            int limit = 3;

            boolean i = addnew(numbers,2);
            System.out.println(i);


    }
            public static boolean addnew (int [] products, int limit) {
                int count = 0;
            for (int i = 0; i < products.length; i++) {

                    if (products[i] == 0) {
                        count++;

                    }

            }

            if(count < limit){
                return true;
            }
            return false;
    }}




