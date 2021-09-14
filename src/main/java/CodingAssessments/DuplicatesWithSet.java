package CodingAssessments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesWithSet {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 10, 20, 30, 40, 50};

        Set<Integer> duplicates = new LinkedHashSet<>();
        Set<Integer> nonduplicates = new LinkedHashSet<>();

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <= nums.length-1 ; j++) {
                if(nums[i] == nums[j]){
                    duplicates.add(nums[i]);
                }else{
                    nonduplicates.add(nums[i]);
                    Arrays.stream(nums);
                }
            }
        }
        System.out.println("DUPLICATES : " + duplicates);
        System.out.println("NONE DUPLICATES : " + nonduplicates);
    }
}
