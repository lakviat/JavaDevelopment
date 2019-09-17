package Complete_Ones;
import java.util.Scanner;
public class Find_MaxLength_StringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scan.nextLine();
        }
        int length = 0;
        String longest = "";

        for (String s : words) {
            if (s.length() > length) {
                length = s.length();
                longest = s;
            }
        }
        System.out.println(longest);
    }}











