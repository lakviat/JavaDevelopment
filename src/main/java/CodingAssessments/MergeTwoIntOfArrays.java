package CodingAssessments;

import java.util.Arrays;

public class MergeTwoIntOfArrays {
    public static void main(String[] args) {
        {
            // first array
            int[] a = { 10, 20, 30, 40 };

            // second array
            int[] b = { 50, 60, 70, 80 };

            // create the resultant array
            int[] c = new int[a.length + b.length];

            // using the pre-defined function arraycopy
            System.arraycopy(a, 0, c, 0, a.length);
            System.arraycopy(b, 0, c, a.length, b.length);

            // prints the resultant array
            System.out.println(Arrays.toString(c));
        }
    }
}

