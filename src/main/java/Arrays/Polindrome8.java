package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Polindrome8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        List<String> names2 = new ArrayList();
        names2.add("Nurlan");
        names2.add("Sher");


        System.out.println("Please enter the 5 name : ");
        names2.add(scan.nextLine());
        List<String> names3 = names2;

        System.out.println("Would you like to continue adding names: y/n");
        if(scan.nextLine().equalsIgnoreCase("yes") && scan.nextLine().equalsIgnoreCase("y")){
            names3.add(scan.nextLine());

        }else
            System.out.println("Goodbye fuck you: ");

        System.out.println(names3);




    }



//        //Convert array to arraylist
//        String [] oldNames = {"Trump", "Obama"};
//        List<String> NewName = Arrays.asList(oldNames);
//        System.out.println(NewName);
//
//        List<String> names = new ArrayList<>();
//        names.add("James");
//        names.add("Trump");

}