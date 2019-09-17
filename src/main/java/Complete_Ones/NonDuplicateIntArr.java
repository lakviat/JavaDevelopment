package Complete_Ones;

import Arrays.DuplicatesPracticePurpose;

import java.util.Arrays;

public class NonDuplicateIntArr {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,30};
        DuplicatesPracticePurpose p = new DuplicatesPracticePurpose();
        p.ThisName(numbers);
        System.out.println("This is method " + Arrays.toString(numbers));

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
}
