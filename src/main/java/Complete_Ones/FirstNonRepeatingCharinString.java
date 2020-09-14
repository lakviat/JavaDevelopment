package Complete_Ones;

import java.util.Arrays;

public class FirstNonRepeatingCharinString {
    public static void main(String[] args) {

        String s = "jjaavvaaf";
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
    }
}
