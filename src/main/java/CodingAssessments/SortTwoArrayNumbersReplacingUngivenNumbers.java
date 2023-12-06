package CodingAssessments;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem
 * Find the largest number in the array and replace any missing
 * numbers with the x and return in ascending order
 * <p>
 * Given example [1, 2, 8]
 * OUTPUT : [1, 2, 3, 4, 5, 6, 7, 8]
 */

public class SortTwoArrayNumbersReplacingUngivenNumbers {
    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 8};

        // FIND MAX NUMBER
        int max = 0;
        int min = 1;
        for (int i = 0, j = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }

        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);

        // FIND MIN NUMBER
        int sorted_num[] = new int[max];

        for (int i = 0; i < max; i++) {
            if (arr[i] != i + 1) {
                sorted_num[i + 1] = i + 1;
            }
            System.out.println(Arrays.toString(sorted_num));
        }
    }
}
