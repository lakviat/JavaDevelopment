package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysNextIntGreaterForOne {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 4, 5, 6, 5,10, 7, 8,};
        body(numbers);
        System.out.println(body(numbers));


        int [] newnumber = {1,2,3,4,5,6,7};
        for (int i = 0; i < newnumber.length ; ++i) {
            for (int j = i+1; j <numbers.length -1 ; ++j) {
                if(newnumber[i] == newnumber[j]){
                    System.out.println("true");
                }else{
                    System.out.println("Not true");
                }

            }

        }


    }

    public static boolean body (int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i + 1]) {


            }
        return true;
        }
    return false;
    }

}















