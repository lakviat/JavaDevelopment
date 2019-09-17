package Practice_Purpose;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_Purpose {
    public static void main(String[] args) {

        String [] firstpart = {""};
        String  id = "Id";
        String domain = "domain";

        String names = "info@cybertekschool.com";
            firstpart = names.split("@");
        for (int i = 0; i <firstpart.length ; i++) {
            id =firstpart[0];
            domain = firstpart[0];
        }
        System.out.println(id +firstpart[0]);
        System.out.println(domain + firstpart[1]);
        }

            }









