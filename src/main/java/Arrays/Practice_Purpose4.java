package Arrays;


public class Practice_Purpose4 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int [] rotated = new int [numbers.length];
        for (int i = numbers.length -1; i >=0 ; i--) {
            rotated[i] = numbers[i];
            System.out.print(rotated[i]);

        }


    }
}



















