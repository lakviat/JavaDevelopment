package Arrays;

import java.sql.Array;
import java.util.Arrays;
public class Biggest_Element_Task {
    public static void main(String[] args) {

    int [] [] nums = {{4,2,6,45,23,1},{22,34,66},{1,2,3}};
        TwoDarray(nums);
    }

    public static void TwoDarray(int [][] nums){
        int maxSum = 0;
        int arrNum = 0;
        for (int i = 0; i <nums.length ; i++) {
            int temp =0;
            for (int j = 0; j <nums[i].length ; j++) {
                temp += nums[i][j];
                if(maxSum < temp){
                    maxSum = temp;
                    arrNum = j;
                }

            }
            System.out.println(arrNum);
        }
    }

}
