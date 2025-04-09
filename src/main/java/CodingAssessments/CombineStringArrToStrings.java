package CodingAssessments;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineStringArrToStrings {
    public static void main(String[] args) {

        String word = "AT";

        String[] articles = {"a", "an", "the"};
        String[] conjunctions = {"at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};

        ArrayList<String> newlist = new ArrayList<String>(Arrays.asList(articles));
        newlist.addAll(Arrays.asList(conjunctions));
        String new_one = newlist.toString();

        if (new_one.contains(word.toLowerCase())) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}



