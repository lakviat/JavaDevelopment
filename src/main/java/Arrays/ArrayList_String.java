package Arrays;
import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.ArrayList;

public class ArrayList_String {
    public static void main(String[] args) {
        String [] arrays = {"this is arrays;"};

        ArrayList<String> num = new ArrayList();
        num.add("Hello what is going on?");
        String num2 = "replaced";
        removeAll(arrays,num,num2);


    }
    public static ArrayList<String> removeAll (String [] arr , ArrayList<String> remove, String target){



            ArrayList<String> newone = new ArrayList();
            newone.addAll(remove);
            newone.remove(target);
            System.out.println("This is ArrayList  " + newone);

            ArrayList arr2 = new ArrayList();
            arr2.add("kiwi");
            arr2.add(true);
            arr2.add(1);
        System.out.println(arr2);


            StringBuilder second = new StringBuilder();


            return newone;
        }
        }

