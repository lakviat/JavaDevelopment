package Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int samnum = 0;
        int [] numbers = {10,20,30,40,50,50,};
        for (int i = 0; i < numbers.length ; i++) {

            if(numbers[i] == numbers[i]){
            samnum =  samnum +  numbers[i];

            }
            System.out.println(samnum);
        }


    }
}
