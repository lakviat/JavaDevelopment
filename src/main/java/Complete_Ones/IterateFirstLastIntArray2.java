package Complete_Ones;
import java.util.*;

public class IterateFirstLastIntArray2 {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60, 70};
        ArrayList<Integer> reverse = new ArrayList<>();
        LinkedHashMap<Integer, Integer> totalresult = new LinkedHashMap<>();
        int [] totalres = new int[num.length*2];

        for (int i = num.length -1; i >=0 ; i--) {
            reverse.add(num[i]);
        }
        for (int i = 0; i <num.length ; i++) {
           totalresult.put(num[i],reverse.get(i));
        }
        Object [] key = totalresult.keySet().toArray(new Object[num.length]);
        Object [] value = totalresult.keySet().toArray(new Object[num.length]);

        for (int i = 0; i <totalresult.size() ; i++) {

        }
    }
}


