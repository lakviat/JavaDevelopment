package Complete_Ones;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDuplicates {
    public static void main(String[] args) {


        ArrayList<String> word = new ArrayList();
        word.add("Hello");
        word.add("Hello");
        ArrayList<String> contains = new ArrayList<String>();
        for(String s : word){
            if(contains.contains(word)){
                System.out.println("found duplicates");
            }else{
                System.out.println("No found");
            }
        }
    }
}
