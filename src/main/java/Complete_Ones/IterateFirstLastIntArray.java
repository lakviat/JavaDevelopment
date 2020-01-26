package Complete_Ones;
import com.google.common.primitives.Ints;
import java.util.List;

public class IterateFirstLastIntArray {
    public static void main(String[] args) {
        //This method Iterates thru first and last values of Int of array

        int [] num = {10,20,30,40,50,60};
        int [] result = new int[num.length +1];

        for (int i = 0; i < num.length ; i++) {
            result[i] = num[i];
            result[++i] = 0;
        }

        List<Integer> list = Ints.asList(result);
        System.out.println(list);


    }
}
