package Arrays;

import java.util.Arrays;

public class Esen4 {
    public static void main(String[] args) {
        char [] mm = getChars("Obama");
        System.out.println(Arrays.toString(mm));

    }
    public static char [] getChars(String word){
        int size = word.length();
        char [] myChars = new char[size];
        for (int i = 0; i < size ; i++) {
            myChars[i] = word.charAt(i);

        }
        System.out.println(Arrays.toString(myChars));
        return myChars;

    }

}
