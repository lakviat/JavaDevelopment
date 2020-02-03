package Complete_Ones;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

public class IterateFirstLastIntArray {
    public static void main(String[] args) {
        //This method Iterates thru first and last values of Int of array

        int[] num = {10, 20, 30, 40, 50, 60, 70};
        int[] result = new int[num.length + 1];
        int[] reverse = new int[result.length];

        for (int i = 0; i < num.length; i++) {
            result[i] = num[i];
            result[++i] = 0;
        }

        int count = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            reverse[count] = num[i];
            count++;
        }
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = reverse[c];
                c++;

            }
        }


        List<Integer> list = Ints.asList(result);
        System.out.println(list);

    }

}
