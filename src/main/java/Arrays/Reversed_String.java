package Arrays;

public class Reversed_String {
    public static void main(String[] args) {


        String newword = "Hello world";
        String reveres = "";
        for (int i = newword.length() -1; i >= 0 ; i--) {
        reveres = newword;
        }
        reveres = reveres +  newword;
        System.out.print(reveres);

    }


}
