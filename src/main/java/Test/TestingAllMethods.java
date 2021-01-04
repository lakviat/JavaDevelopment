package Test;
import Complete_Ones.IterateFirstAndLastIntArif2;

import java.util.Arrays;
import java.util.List;

public class TestingAllMethods {
    public static void main(String[] args) {
        IterateFisrtAndLastArr();
    }
    public static void IterateFisrtAndLastArr(){

        int [] num = {10,20,30,40,50,60,70};
        int [] newnum = new int [num.length];

        int j = 0;
        for (int i = 0,  k = num.length -1; j < num.length;  i++, k--){
            newnum[j++] = num[i];
            if(j < num.length){
                newnum[j++] = num[k];
            }
        }
        System.out.println(Arrays.toString(newnum));
    }
    public void FindDuplicatesUsingStream(){
        int [] num = {10,20,30,40,50,60,60};
        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});


    }
}
