package Arrays;
import java.util.Arrays;
import java.util.Random;
public class Homework9 {
    public static void main(String[] args) {
        boolean get = true;
        String [] names = {"Nurlan", "Donald Trump", "Asel Altymyshova", "Nurbek"};
        System.out.println(stringmethod(names));
    }

    public static String [] stringmethod (String [] names){

        String newnames = "";
        for (int i = 0; i < names.length; i++) {
            if(names[i].contains(" ")){
                newnames = names[i];
                System.out.println(newnames);
            }

        }


        return null;

    }
}

