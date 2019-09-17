package Practice_Purpose;
import java.util.Arrays;
import java.util.Scanner;
public class PracticePurpose {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] arr = new int [size];
        for (int i = 0; i <=size -1 ; i++) {

        arr[i] = scan.nextInt();

        IsPos(arr[i]);



        }


    }
    public static void IsPos (int num){
        if(num < 0 ){
            System.out.println("Its negative");
        }else
            System.out.println("Its positive");



    }

}
