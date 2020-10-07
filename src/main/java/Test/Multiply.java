package Test;

import java.util.ArrayList;
import java.util.List;

public class Multiply {
    public static void main(String[] args) {

        List<String> collect = new ArrayList<>();
        collect.add("Hello");
        for (int i = 0; i < collect.size(); i++) {
            String num = collect.get(i);
            num += num += num;
            System.out.println(num);
        }

        String num = "hello";
        char[] singles = num.toCharArray();
        System.out.println(singles);
        for (int i = 0; i < singles.length; i++) {


        }

    }

}
