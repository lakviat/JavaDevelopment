package Arrays;
import java.util.Scanner;
public class Class2_even_numbers {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};

        int counter = 0;

        for(int i : nums){

            if(i %2 == 0){
                counter ++;
            }
        }
        System.out.println("Even numbers: " + counter);

    }

}
