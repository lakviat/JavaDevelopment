package CodingAssessments;
import java.util.Arrays;

public class intPolindrome {
    public static void main(String[] args) {
        // This function finds polindrom

        String name[] = {"aibek", "abba", "nur", "hel", "bob"};
        for (int i = 0; i <name.length/2 ; i++) {
            String temp ="";
            temp = name[i];
            name[i] = name[name.length-1-i];
            name[name.length-1-i] = temp;
            System.out.println(temp);

        }
        System.out.println(Arrays.toString(name));
    }
}


