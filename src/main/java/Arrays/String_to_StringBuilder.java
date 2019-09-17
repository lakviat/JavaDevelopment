package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class String_to_StringBuilder {
    public static void main(String[] args) {

        StringBuilder stbuilder = new StringBuilder();
        String[] mainwords = {"Hello world What is that this been added"};
        for (String converted : mainwords) {

            stbuilder.append(converted);
            System.out.println(converted);

        }


    }
}
