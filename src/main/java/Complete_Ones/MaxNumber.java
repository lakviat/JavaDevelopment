package Complete_Ones;

import cucumber.api.java.it.Ma;

import javax.sound.midi.Soundbank;
import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        int [] num = {10,20,30,40,70};
        int max = num[0];
        for (int i = 1; i < num.length ; i++) {
            if(num[i] > max){
                max = num[i];

            }
        }
        System.out.println(max);



        MaxNumber duplicate = new MaxNumber();
        duplicate.duplicates();
    }
        public void reverse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word to reverse: ");
        String word = scan.nextLine();
        String reversed = "";
            for (int i = word.length() -1; i >=0 ; i--) {
                reversed = reversed + word.charAt(i);

            }
            System.out.println(reversed);
    }
        private void duplicates(){

        Scanner scan = new Scanner(System.in);
            String answer = "";
            int nums = 0;
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            do{
                System.out.println("Please enter array numbers: ");
                nums = scan.nextInt();
                numbers.add(nums);
                System.out.println("Do you want to continue ? ");
                answer = scan.nextLine();

            }while (answer =="yes");


            for (int i = 0; i <numbers.size(); i++) {
                boolean duplicate = false;
                for (int j = 0; j <numbers.size() ; j++) {
                    if( i != j && numbers.get(i) == numbers.get(j)){
                        duplicate = true;
                    }
                }
                if(duplicate == true);
                System.out.println(numbers.get(i));
            }
        }
}

