package Arrays;

import java.util.Arrays;

public class Esen5 {
    public static void main(String[] args) {

        int [] numbers = {12,23,34,};
        String [] words = {"Hello","world"};

        newstring(words);
        newint(numbers);

        System.out.println(Arrays.toString(words ));
        System.out.println(Arrays.toString(numbers));

    }

    public static String [] newstring ( String [] input2){
        return input2;

    }

    public static int [] newint (int [] input){
        return input;
    }

}
