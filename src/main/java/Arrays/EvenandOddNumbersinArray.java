package Arrays;

public class EvenandOddNumbersinArray {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 4,};
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] % 2 ==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("Even numbers: " + even_count);
        System.out.println("Odd numbers: " + odd_count);
    }
}
