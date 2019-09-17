package Complete_Ones;
import java.util.ArrayList;
import java.util.Scanner;
public class TwoDArrayfoIntsFindBiggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = 10;
        int cols = 20;


        System.out.println("Please enter the number: ");
       DoWhileInt(scan.nextInt());


    }

    public static void DoWhileInt(int next) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int count = 0;
        ArrayList<Integer> biggestnumber = new ArrayList<Integer>();
        do {

            System.out.println("Please enter the number");
            count++;
            biggestnumber.add(scan.nextInt());
            FindTheBiggestNumber(biggestnumber);


        } while (count < 2);

        System.out.println("Here is the total: " + total);

        System.out.println("here is the biggest number" + total);

    }


    //also added one more code here that will count the total amount of added numbers
    public static void FindTheBiggestNumber(ArrayList<Integer> next) {
        int max = 0;
        for (int i = 0; i < next.size(); i++) {
            if (next.get(i) > max) {
                max = next.get(i);
            }
            System.out.println(max);
        }

    }
}



