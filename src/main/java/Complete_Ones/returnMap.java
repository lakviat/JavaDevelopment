package Complete_Ones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class returnMap {
    public static void main(String[] args) {
        String [] randomnum = {"a","b","c"};
        Map<String,Integer> combined = new HashMap<>();
        for (String element : randomnum){
            System.out.println(element);
            combined.put(element,0);
        }
    }
}
