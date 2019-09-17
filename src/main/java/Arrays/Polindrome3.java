package Arrays;

import java.util.Arrays;

public class Polindrome3 {
    public static void main(String[] args) {
        int n = 6;
        add(n);
        System.out.println(Arrays.toString(add(n)));
    }

    public static int[] add(int nums) {
        int [] newarray = new int [nums];
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] =i;
        }
        return newarray;
    }

}



