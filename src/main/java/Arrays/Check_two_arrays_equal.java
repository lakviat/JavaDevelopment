package Arrays;

public class Check_two_arrays_equal {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {1,2,2,4,5};


        boolean flag = true;

        if(nums1.length != nums2.length){
            System.out.println("Arrays NOT euqal");
        }else {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]) {
                    flag = false;
                }}}

                    if (flag == true) {
                        System.out.println("Array are equal");
                    } else {
                        System.out.println("array not euqal");
                    }
                }
            }

