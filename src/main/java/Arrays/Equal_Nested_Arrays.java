package Arrays;

public class Equal_Nested_Arrays {
    public static void main(String[] args) {
        int[][] nums = {{23, 23, 43, 43}, {23, 23, 43, 43}};

        for(int i =0; i< nums.length - 1; i++){
            if(nums[i].length != nums[i +1].length){
                System.out.println("They are not equal");
            }else{
                for(int b = 0; b < nums[i].length; b++){
                    if(nums[i][b] != nums [i+1][b]){
                        System.out.println("They are not equal");
                    }
                }
            }


                System.out.println("They are not equal");

        }


                }


                }










