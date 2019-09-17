package Assignemnts;
import java.util.ArrayList;
import java.util.Arrays;

public class String1_2 {
    public static void main(String[] args) {
        String [] one = {"f","o","o"};
        String [] two = {"b","a","r"};
        ArrayList<String> word = new ArrayList(Arrays.asList(one));


        word.addAll(Arrays.asList(two));
        String m ="";

        for(String each : word){
           m+=each;

           ArrayList<Integer> numbers = new ArrayList();
            numbers.add(10);
            numbers.add(20);

            int newnum = 0;
            for(int each2 : (ArrayList<Integer>)numbers){
                newnum = newnum + each2;

                System.out.println(each2);
            }



        }
        System.out.print(m);

    }

    }






