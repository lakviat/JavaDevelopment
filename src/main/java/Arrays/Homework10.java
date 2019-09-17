package Arrays;
import java.util.Arrays;
public class Homework10 {
    public static void main(String[] args) {

    String [] names = {"Jmes Bond", "Donald Trump Junior", "Adam", "John Wick"};

        System.out.println(TwoandMorewords(names));



    }

    public static String[] TwoandMorewords(String[] namelist) {

        for (String name : namelist) {
            int count = 0;
            if (name.trim().contains(" ")) {
                count++;
                System.out.println(name);
            }

            int index = 0;
            String[] newarray = new String[count];
            System.out.print("Count: " + count);
            for (int i = 0; i < namelist.length ; i++) {
            String name1 = namelist[i];
            name1 = name1.trim();
                //System.out.println(name1);
                if(name1.contains(" ")) {
                    newarray[index] = name1;
                    index++;
                }

            }
            System.out.println(Arrays.toString(newarray));
        }
        return null;

    }}



