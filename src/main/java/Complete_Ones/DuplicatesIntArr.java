package Complete_Ones;

import Arrays.DuplicatesPracticePurpose;

import java.util.Arrays;

public class DuplicatesIntArr {
    public static void main(String[] args) {

        //FIND DUPLICATES IN A INTEGER OF ARRAYS
        // IF CHANGE DUPLICATE == FALSE IT WILL RETURN NON DUPLICATES
        int [] numbers = {10,20,30,40,30};
        DuplicatesPracticePurpose p = new DuplicatesPracticePurpose();
        p.ThisName(numbers);
        System.out.println("This is method " + Arrays.toString(numbers));

        int [] num = {10,20,30,10,20,30,40};
        for (int i = 0; i < num.length ; i++) {
            boolean duplicate = false;
            for (int j = 0; j < num.length ; j++) {
                if(i != j && num[i] == num[j]){
                    duplicate = true;
                    break;
                }
            }
        if(duplicate == true){
            System.out.print("THIS ARE DUPLICATES :  " + num[i] + "\n" );
        }

        }

    }
}
