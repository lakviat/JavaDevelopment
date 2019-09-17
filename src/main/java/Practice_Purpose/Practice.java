package Practice_Purpose;

import Complete_Ones.Duplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {


        String word = "at, and, an, whatisthat";

        String[] Articels = {"a", "an", "the"};
        String[] conjustctions = {"at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};

        ArrayList<String> newlist = new ArrayList<String>(Arrays.asList(Articels));
        newlist.addAll(Arrays.asList(conjustctions));

        System.out.println(newlist.toString());

            }

        public void Inheriting(){
            Duplicate d = new Duplicate();

            int [] numbers = {10,20,30,40};
            d.duplicates(numbers);
            System.out.println("This is duplicate method " +numbers);

        }
}































