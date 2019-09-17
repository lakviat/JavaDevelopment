package Complete_Ones;
import java.util.Arrays;
public class DoubleArrReplaceLastEl {
    public static void main(String[] args) {

        ///This methods will double the size of array, and replace the last element of the array with existing one

        int [] nums  = {10,50};
        int [] doubled = new int [nums.length *2];
        int lastelement = 0;
        for (int i = 0; i < nums.length; i++) {
            lastelement = nums[nums.length -1];
        }
        doubled[doubled.length -1] = lastelement;
        System.out.println(Arrays.toString(doubled));
    }

            }


