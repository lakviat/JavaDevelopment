package Complete_Ones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindSeasonMonthIntArr {
    public static void main(String[] args) {

        // winter, spring, summer, fall
        int[] nums = {4, 7, 8, -1, 6, 4, -4, 3, 4, 9, 0, 5};

        String[] seasons = {"winter", "spring", "summer", "fall"};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int difference = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0, k = 0, s = 0; i < nums.length; i++, k++) {

            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

            if (k == 2) {
                difference = max - min;

                map.put(seasons[s], difference);

                s++;
                k = -1;

                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;
            }
        }


        Set<String> key = map.keySet();
        for (String str : key) {
            System.out.println(map.get(str) + " " + str);
        }
    }
}
