package Arrays;

import java.util.Arrays;

public class Polindromes2 {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 1, 4, 1, 1,};
        main(numbers);
        System.out.println(main(numbers));
    }

    public static boolean main(int[] num) {
        int ones = 0;
        int fours = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                ones++;
            }
            if (num[i] == 4) {
                    fours ++;

                }

                }

            if(ones > fours){
                return true;
            }        else{
                return false;
            }

    }}








