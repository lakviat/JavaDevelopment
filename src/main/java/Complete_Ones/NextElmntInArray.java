package Complete_Ones;

import java.util.Arrays;

public class NextElmntInArray {
    public static void main(String[] args) {

//
//        Given an int array length 3, if there is a 2 in the array
//        immediately followed by a 3, set the 3 element to 0.
//        Return the changed array.

        int [] number = {1,2,3,2,2,2,5};
        for (int i = 0; i < number.length ; i++) {
            if(number[i] ==2 && number[i + 1] ==3){
                number[i +1] = 0;
                System.out.println(Arrays.asList(number + "True"));
            }else{
                System.out.println(Arrays.asList(number + "NOT True"));
            }

        }
    }
}
