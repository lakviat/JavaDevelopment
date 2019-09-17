package Arrays;
import java.util.Arrays;
public class Class6_Esen {
    public static void main(String[] args) {
        int []  values = {23,34,};

        System.out.println(Arrays.toString(values));

        for(int i = 0; i < values.length; i++){
            if(values[i] % 10 != 0){
            values[i] = 10;



            }

        }
        System.out.println(Arrays.toString(values));
    }
}
