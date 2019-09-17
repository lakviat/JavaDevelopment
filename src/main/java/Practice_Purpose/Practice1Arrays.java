package Practice_Purpose;
import java.util.Scanner;
public class Practice1Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter word: ");
        String word = scan.nextLine();
        str(word);




    }
    public static String str (String name ) {
//        import java.util.StringBuilder;

        Stringbuilder stringb = new Stringbuilder();

        if (name.contains(" ") && name.length() <= 3 ) {
            System.out.println("invalid data");
        }if(name.contains("con")) {
            System.out.println("invalid data");
        }else {
            if (name.contains("con"));
            name = stringb.toString();



        }
            return name;

        }
    }



