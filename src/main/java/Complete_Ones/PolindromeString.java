package Complete_Ones;

import java.util.Arrays;

public class PolindromeString {
    public static void main(String[] args) {
        String [] name2 =  {"hello", "world"};

        //This methods prints out the first and the last letter of the String.

        String[] words = {"Hello", "world", "word"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].substring(0,1)+" "+words[i].charAt(words[i].length() -1));

        //Below method will be for the practice only
        }
        }
    public String [] PolindromStrin2g ( String [] polin ){
        String [] ready = {""};
        for (int i = 0; i <polin.length ; i++) {
            ready[i] += polin[i].substring(0, polin.length-1);
        }


        return ready;
    }

}





















