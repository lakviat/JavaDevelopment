package Complete_Ones;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DuplicatesArrayList {
    public static void main(String[] args) {

        ArrayList<String> word = new ArrayList();
        word.add("Hello");
        word.add("Hello");
        word.add("NoHello");
        word.add("Random");

        ArrayList<String> duplicates = new ArrayList<String>();
        for(String s : word){
            if(!duplicates.contains(s)){
                duplicates.add(s);
                System.out.println("Duplicates FOUND : ");
            }else{
                System.out.println("Duplicates NOT FOUND : ");
            }
            System.out.println(duplicates.toString());
        }
    }
}
