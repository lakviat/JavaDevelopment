package Complete_Ones;

import Constructors.Const;
import Constructors.TestConstructor;
import Day_42_Constructor.Constructor;

public class ReverseString {
    public static void main(String[] args) {
        String words = "Hello world";
        String reverese = "";
        for (int i = words.length() -1; i >= 0 ; i--) {
        reverese = reverese + words.charAt(i);

        }
        System.out.print(reverese);

    }
}
