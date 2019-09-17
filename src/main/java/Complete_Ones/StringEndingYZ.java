package Complete_Ones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringEndingYZ {
    public static void main(String[] args) {


      String name = "Nurlan Nursultan Nazar";

      //TODO print out first and last lettte fo the string Nn Nn Nr

        String [] names = name.split(" ");

        String name1 = names[0];
        String name2 = names[1];
        String name3 = names[2];

       String name10 = name1.substring(0,1);
       name10 += name1.substring(name1.length() -1);
        System.out.println(name10);


        }


    }






