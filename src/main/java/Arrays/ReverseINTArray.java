package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class ReverseINTArray {
    public static void main(String[] args) {


    int [] numbers = {10,20,30,405,0};

    for (int i = numbers.length -1; i >= 0; i--) {
    numbers[i] = numbers[i];



        }
        System.out.print(Arrays.toString(numbers));

    }}
