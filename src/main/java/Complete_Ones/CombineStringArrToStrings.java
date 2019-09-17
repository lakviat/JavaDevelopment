package Complete_Ones;

import java.util.ArrayList;
import java.util.Arrays;
public class CombineStringArrToStrings {
public static void main(String[]args) {


    String word = "AT";

    String[] Articels = {"a", "an", "the"};
    String[] conjustctions = {"at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};

    ArrayList<String> newlist = new ArrayList<String>(Arrays.asList(Articels));
    newlist.addAll(Arrays.asList(conjustctions));
    String newone = newlist.toString();



    if(newone.contains(word.toLowerCase())){
        System.out.println("found");
    }else {
        System.out.println("not found");
    }

}
}



