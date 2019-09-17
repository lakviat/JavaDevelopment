package Practice_Purpose;

public class Duplicates {
    public static void main(String[] args) {

      int [] numbers1 = {10,20,30,40,};
      int [] numbers2 = {60,70,80,10};

        Duplicates(numbers1,numbers2);


        int[] nums = {10, 20, 20,30,30};
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(i != j &&  nums[i] == nums[j]){

                    System.out.println(j);

                }
            }
        }



        }
    public static void Duplicates(int [] num1, int [] num2){
        for (int i = 0; i <num1.length; i++) {
            for (int j = 0; j <num2.length; j++) {
                if( num1[i] == num2[j]){
                    System.out.println("This is methods duplicates " +j);
                }
            }
        }


     }
    }

