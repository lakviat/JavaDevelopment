package Complete_Ones;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        int size = input.length;
        if (size == 0)
            System.out.println("size is 0");
        if (size == 1)
            System.out.println("size is 1");
        /* sort the array of strings */
        Arrays.sort(input);
        /* find the minimum length from first and last string */
        int end = Math.min(input[0].length(), input[size-1].length());
        /* find the common prefix between the first and last string */
        int i = 0;
        while (i < end && input[0].charAt(i) == input[size-1].charAt(i) )
            i++;
        String pre = input[0].substring(0, i);
        System.out.println( "The longest Common Prefix is : " + pre);

    }
}

