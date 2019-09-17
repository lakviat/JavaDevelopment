package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Polindrome10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("James");
        names.add("Adam");
        names.add("Obama");
        removeElements(names,4);

    }
    public static void removeElements (List<String>  list, int size) {
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i).length() == size){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}






