package Complete_Ones;

import java.util.Arrays;

public class IterateFirstLastIntArrArif {
        public static void main(String[] args) {

            int [] array = {10,20,30,40,50,60,70};

            int [] newArray = new int[array.length];
            int j = 0;
            for (int i = 0, k = array.length-1;  j < array.length;  i++ ,k--) {
                newArray[j++] = array[i];
                if(j < array.length) {
                    newArray[j++] = array[k];
                }
            }

            System.out.println(Arrays.toString(newArray));
        }
    }

