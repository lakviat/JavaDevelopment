package Arrays;
import java.util.Arrays;
public class CombineTwoStrings {
    public static void main(String[] args) {
        String [] first = {"Hello world"};
        String [] second = {"NOt really"};

        String [] total = new String [first.length + second.length];
        for (int i = 0; i <total.length; i++) {
            System.out.println(total[i]);

        }
    }
}
