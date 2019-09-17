package Complete_Ones;

import java.util.Arrays;

public class FindSameINTnext {
    public static void main(String[] args) {

        int [] numbers2 = {10,20,30,40,5,5,};
        System.out.println();
        System.out.println(numbers3(numbers2));

    }
    public static boolean numbers3 (int [] numbers) {

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] == 5 && numbers[i + 1] == 5) {

                return true;
            }

        }
        return false;
    }

}
