package Games;

import java.util.Arrays;

public class SameValuesinString {
    public static void main(String[] args) {
        System.out.println(findtwovalues("kot","KOT"));
    }
    public static boolean findtwovalues(String str1, String str2){
        boolean valu = false;
        char [] values = str1.toCharArray();
        char [] values2 = str2.toCharArray();
        Arrays.sort(values);
        Arrays.sort(values2);
        return Arrays.equals(values, values2);

    }
}
