package Complete_Ones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
public class GuestAddingDoWhile {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();

        String name = "";
        String answer = "";
        do {
            System.out.println("Enter guest name: ");
            name = scan.nextLine();
            names.add(name);
            System.out.println("Do you want to conitinue: ? ");
            answer = scan.nextLine();

        } while (answer.equals("yes"));
        System.out.println(names);



    }
}
