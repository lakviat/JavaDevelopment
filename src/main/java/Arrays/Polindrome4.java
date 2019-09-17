package Arrays;
import java.util.Arrays;
public class Polindrome4 {
    public static void main(String[] args) {
        int [] nums = {10,20,30,40,10,1,1};
        int count = 0;
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = i; j <nums.length; j++) {
                if(nums[i] == nums[j]){
                    //if(count[] = 1)
                    count++;
                }
            }
            System.out.println(nums[i]);

        }

    }}










