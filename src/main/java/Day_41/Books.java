package Day_41;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Books {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputs = new ArrayList();

        System.out.println("Please enter total books: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter title for a book 1: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter author for a book1: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter pages for a book1: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter title for a book2: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter author for a book2: ");
        inputs.add(scan.nextLine());
        System.out.println("Please enter pages for a book2: ");
        inputs.add(scan.nextLine());

        System.out.println(inputs);

        }


    }

