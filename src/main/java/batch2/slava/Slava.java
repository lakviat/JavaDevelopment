package batch2.slava;

import org.jetbrains.annotations.NotNull;

public class Slava {
    public static void main(String[] args) {

        System.out.println("My name is Slava");

        // Please fix the package missing in the Slava Class so that it is not highlighting
        // Please clean your folder and remove slava.txt
        // Add a method that returns a duplicate numbers multiplied by 2 in array of integers

        Slava method = new Slava();
        int[] arr = {10,20,5,4,4,2,57,10,6};
        int size = arr.length;
        method.Array(arr,size);
    }
    private void Array(int @NotNull [] arr, int size){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < size; j++ ){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}