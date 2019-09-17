package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Polindrome6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("James");
        names.add("Trump");
        System.out.println(names);
        add(names, "Trump", "Nurik", "Nurich");
        System.out.println(names);

    }

    public static List<String> add(List<String> list, String ... elements) {
        for (String str : elements){
        list.add(str);

        }
    return list;
    }
}
