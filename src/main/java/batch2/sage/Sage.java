package batch2.sage;

import java.util.Arrays;

public class Sage {
    public static void main(String[] args) {
        System.out.println("Hello this is Sage");

        int [ ] arr = {28,40,39,10};
        sortNumAscending(arr);

        // Please add a method to sort the number in the ascending order
        // array of numbers int arr = {28,40,39,10}
    }

    public static void sortNumAscending (int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
