package Arrays;

public class NumberOfDuplicates {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 10, 20, 30, 40};
        int total = 0;
        for (int i = 0; i <numbers.length ; i++) {
            int count = 0;

        for (int j = 0; j <numbers.length ; j++) {
            if(numbers[i] == numbers[j]) {
                count++;
            }
        }
        if(count > 1){
            total++;
        }
    }
        System.out.println(total);
    }
}
