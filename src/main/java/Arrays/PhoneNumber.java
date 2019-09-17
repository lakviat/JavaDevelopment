package Arrays;

import java.util.ArrayList;
import java.util.Random;


public class PhoneNumber {
    public static void main(String[] args) {
        phonenumber(0);
        int numbers = 102039450;

        int [] newnumbers = {10,20,30,10,20,9,9,9};
        name(newnumbers);
    }
    public static void phonenumber  (int numbers ){

    }
    public static int [] name (int [] numbers ) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            if (numbers[i] == 9) {
            count++;

            }
            count = count;
            System.out.println(count);
        }
    return numbers;
    }
    public static ArrayList<Integer> randomNumbers(){
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList(rnd.nextInt(9));
        return numbers;
    }
}
