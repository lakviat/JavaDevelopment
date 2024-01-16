package CodingAssessments;
import java.util.Arrays;

public class ReplaceMissingNumbersInTwoIntOrArraysWithX {
    /*
        a = [2, 1, 3, 6]
        b = [1, 4, 5]
        return
        a = [1, 2, 3, 'x', 'x', 6]
        b = [1, 'x', 'x', 4, 5, 'x']
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7};
        int[] b = {2, 3, 10};
//        result(a);
        result(b);
    }

    public static void result(int[] num) {
//        int start = num[0];
        int end = num[num.length - 1];
        int[] result = new int[findMax(num)];

        for (int i = findMin(num); i <= end; i++) {
            result[i - 1] = i;
            if (indexOf(num, i) == -1) {
//                System.out.println("Missing number: " + i);
                result[i] = i;
            }
        }
        System.out.println("PRINTING THE RESULT : " + Arrays.toString(result));
//        return result;
    }

    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findMin(int [] num){
        int min = num[0];
        for (int i = 0; i <num.length ; i++) {
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

    public static int findMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}

