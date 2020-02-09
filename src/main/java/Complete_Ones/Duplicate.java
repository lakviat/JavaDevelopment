package Complete_Ones;
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 10, 20, 30, 40};
        for (int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate == true)
                System.out.print(nums[i] + " ");
        }
    }
    public int [] duplicates (int [] nums){
        return nums;
    }
}





