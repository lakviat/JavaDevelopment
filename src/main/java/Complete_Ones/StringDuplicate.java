package Complete_Ones;

import java.util.Arrays;

public class StringDuplicate {
    public static void main(String[] args) {


        String str = "I'm am am learning java java";
        String[] str2 = new String[str.length()];
        int count = 0;
        String total = "";

        str2 = str.split(" ");
        for (int j = 0; j < str2.length; j++) {


            for (int i = 0; i < str2.length; i++) {
                if (i == j && str2[i] == str2[j]) {
                    total += str2[i];
                    count ++;

                    System.out.println(count + " " + total);
                }

            }
        }
    }
}
