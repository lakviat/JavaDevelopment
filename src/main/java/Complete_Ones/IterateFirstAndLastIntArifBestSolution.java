package Complete_Ones;

import java.util.Arrays;

public class IterateFirstAndLastIntArifBestSolution {
    public static void main(String[] args) {

        // This creates a new array of integers and iterates first followed with last one

        int [] array = {10,20,30,40,50,60,70,80};
        int [] newArray = new int[array.length];

        for (int i = 0, j = 0;  j < array.length; i++) {
            newArray[j++] = array[i];
            if(j < array.length) {
                newArray[j++] = array[array.length-i-1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

