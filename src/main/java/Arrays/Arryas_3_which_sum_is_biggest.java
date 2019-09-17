package Arrays;

import java.util.Arrays;

public class Arryas_3_which_sum_is_biggest {
    public static void main(String[] args) {
        int [] [] numbers = {{12,23,45,56},{234,45,234},{23,64,78}};

    }
        public static void findMaxSum(int [] [] numbers){
        int maxSum = 0;
        for(int i = 0; i < numbers.length; i++){
            int temp =0;

            for (int j = 0; j < numbers[i].length ; j++) {
                temp += numbers[i][j];
                if(maxSum < temp){
                    maxSum = temp;
                    //arrNum = i;
                }
                System.out.println(Arrays.toString(numbers[i]));
            }
        }
        }

}
