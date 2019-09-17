package ClassMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomClass {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList();
        ArrayList<String> nums2 = new ArrayList();

        ArrayList<String> newone = new ArrayList(nums);
        newone.addAll(nums2);

        String name = "Hello";

        ArrayList<String> newone2 = new ArrayList(Arrays.asList(name));
        nums.removeAll(newone2);


    }
   public static ArrayList removeAll(ArrayList<String> wordlist, String list){
        return null;
   }

    }


