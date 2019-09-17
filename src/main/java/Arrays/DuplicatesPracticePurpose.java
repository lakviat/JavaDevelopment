package Arrays;

import Complete_Ones.Duplicate;

public class DuplicatesPracticePurpose {
    public static void main(String[] args) {



        int [] num = {10,20,30,10,20,30,40};
        for (int i = 0; i < num.length ; i++) {
            boolean duplicate = false;

            for (int j = 0; j < num.length ; j++) {

                if(i != j && num[i]== num[j]){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate == false){
                System.out.print(num[i] + " ");
            }
        }
    }
    public  int [] ThisName ( int [] newnum ){
        int [] numbers = {102,0,30,30};

        System.out.println(numbers);
        return newnum;
    }


}
