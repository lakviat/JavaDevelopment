package CodingAssessments;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {

        // Reverse Int of array

        int [] numbers = {10,20,30,40,59,70};
        for (int i = 0; i < numbers.length /2  ; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - (1+i)];
            numbers[numbers.length-(1+i)] = temp;
            System.out.println(Arrays.toString(numbers));

        }
    }
}
