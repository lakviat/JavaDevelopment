package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Polindrome7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {


            System.out.println("Please enter the name : " + i++ + " ");

            String[] names = {scan.nextLine()};

            List<String> newNames = Arrays.asList(names);
            System.out.println(newNames);
        }

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

