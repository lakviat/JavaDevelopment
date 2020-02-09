package Complete_Ones;

import java.util.Arrays;

public class IterateFirstAndLastIntArrSedaVersion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50,70,80,90,100};

        //Declare and assign an array by reversing original one.
        int[] arrReversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arrReversed[arr.length - 1 - i] = arr[i];
        }

        //Store each value in the string by using each element of the arrays one by one
        String result = "";
        int []arrFinal = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            result += arr[i]+" ";
            for(int j = i; j==i; j++){
                result+=arrReversed[j]+ " ";
            }
        }
        //Convert your string to string array(The length of String array will be sum of arrays' length*
        String [] arrTemp = result.split(" ");

        //store the integer value of each element of the string array in the new integer array
        //   * loop it half amount times of string array's length
        for(int i =0; i<arrTemp.length/2; i++ ){
            arrFinal[i]= Integer.valueOf(arrTemp[i]);
        }
        System.out.println(Arrays.toString(arrFinal));
    }
    }

