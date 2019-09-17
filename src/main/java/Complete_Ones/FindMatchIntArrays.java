package Complete_Ones;

import java.util.Arrays;

public class FindMatchIntArrays {
    public static void main(String[] args) {
        int count = 0;
        int [] nums = {10,20,30,40,50,60,10,20,30,40,50};
        for (int i = 0; i <nums.length -1 ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if( nums[i] != nums[j]){
                    count ++;
                    System.out.println(" Not Duplicate " + nums[j]);
                    break;

                }

            }
        }

        }
    }
