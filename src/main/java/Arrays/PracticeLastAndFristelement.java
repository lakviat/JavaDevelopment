package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class PracticeLastAndFristelement {
    public static void main(String[] args) {

        int [] lastelement = new int [1];
        int [] firstelement = new int [1];
        int []  numbers = {10,20,30,40,50};
        for (int i = 0; i <numbers.length ; i++) {


            lastelement[0] = numbers[i-1];
            firstelement[0] = numbers[0];

            numbers[i-1] = firstelement[0];
            numbers[0] = lastelement[0];


        }

        System.out.println(numbers);
    }

}
