package Arrays;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
    int [] main_number = {10,20,30,40};
    add_to_r(main_number, 9);


    }
        public static void add_to_r(int [] numbers, int n){

        int [] new_numbers = new int [numbers.length +1];

        for (int i = 0; i <numbers.length ; i++) {
            new_numbers[i] = numbers[i];
            new_numbers[new_numbers.length -1] = n;

        }
            System.out.println(Arrays.toString(new_numbers));
        }


}
