package Complete_Ones;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumbersInterview {
    public static void main(String[] args) {
        int [] array = {1,2,3,7,8,9,10};
        Arrays.sort(array);
        int missinnumber = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i] != missinnumber){
                System.out.println(missinnumber );
            }
            missinnumber++;
        }
    }
}
