package Day_41;
import java.util.ArrayList;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalbooks = 3;
        int count = 1;

        ArrayList<String> Input = new ArrayList();

        for (int i = 1; i < totalbooks; i++) {


            System.out.println("Please enter name of the book: " + count);
            Input.add(scan.nextLine());
            System.out.println("Please enter author for the book: " + count);
            Input.add(scan.nextLine());
            System.out.println("Please enter pages for the book: " + count);
            Input.add(scan.nextLine());
            count++;
        }

        System.out.println(Input);


    }



    }

