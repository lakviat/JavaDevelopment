package Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Esen {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(sc.hasNextLine()){
            String name = sc.nextLine().trim();
            System.out.println(name);
            count++;
        }


        }
        public static void generateNewGroup(String [] students, int groupSize){






        }
}

