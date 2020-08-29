package Test;

public class MinNumber {
    public static void main(String[] args) {

        int [] number = {10,20,30,40,40};
        int min = number[0];
        for (int i =0; i < number.length; i ++){
            if (number[i] < min){
                min = number[i];

            }
        }
        System.out.println(min);
    }
}
