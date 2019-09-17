package Arrays;
import java.util.Arrays;
public class Homework15 {
    public static void main(String[] args) {
        int [] main_numbers = {10,20,30,40};

    }
    public static void int_method(int [] numbers, int n){
       int [] new_numbers = new int [numbers.length +1];
       for (int i = 0; i <numbers.length ; i++) {
           new_numbers[i] = numbers[i];
           new_numbers[new_numbers.length -1] =n;

        }
    }

}
