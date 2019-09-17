package Arrays;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Polindrome5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();

        System.out.println("Size before adding elements: " + names.size());

        names.add("James");
        names.add("John");
        names.add("Trump");

        System.out.println("Size after adding aelements: " + names.size());

        System.out.println(names);

        names.add(0, "Obama");
        System.out.println(names);
        System.out.println(names.get(2));




    }
}
