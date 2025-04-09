package CodingAssessments;

/*
Example
The minimum sum is  and the maximum sum is . The function prints
Hackerrank
 */

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxSumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        int minNum = Collections.min(arr);
        int minIndex = arr.indexOf(minNum);

        int maxNum = Collections.max(arr);
        int maxIndex = arr.indexOf(maxNum);

        int totalSum = 0;
        for(int val : arr){
            totalSum = totalSum + val;
        }

        int minSum = totalSum - arr.get(minIndex);
        int maxSum = totalSum - arr.get(maxIndex);

        System.out.println(maxSum + " " + minSum);

    }
}
