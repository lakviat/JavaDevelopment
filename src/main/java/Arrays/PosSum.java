package Arrays;
import java.util.Arrays;


import java.util.ArrayList;

public class PosSum {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(-1);

        PosSam(numbers);



        ArrayList<Integer> num = new ArrayList();
        num.add(10);
        num.add(20);
        num.add(20);
        num.add(-1);
        ArrayList<Integer> newarraysofInts = new ArrayList();
        ArrayList<Integer> total = new ArrayList();
        int count = 0;

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > 0) {
                newarraysofInts.add(num.get(i));
            }


            for(int k : newarraysofInts){

                count += k;

            }
        }

        System.out.println("This is first part" + newarraysofInts);

        System.out.println("This is second part " + count);

    }

    public static ArrayList<Integer> PosSam(ArrayList<Integer> num) {
        ArrayList<Integer> newarraysofInts = new ArrayList();
        ArrayList<Integer> total = new ArrayList();
        int count = 0;

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > 0) {
                newarraysofInts.add(num.get(i));
            }
                for( int j : newarraysofInts){
                    total.add(j);
                }
            }
    return total;
    }
    }



