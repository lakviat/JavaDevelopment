package Complete_Ones;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = new int[a.length * 2];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];


        }
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");

        }
    }

}

