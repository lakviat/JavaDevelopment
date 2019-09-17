package Arrays;
import java.util.ArrayList;
import java.util.List;
public class ArrayListofIntegers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        System.out.println(homework(numbers));

    }

    public static List<Integer> homework(List<Integer> first) {
        first.add(10);
        first.add(20);
        first.add(30);

        return null;
    }

}
