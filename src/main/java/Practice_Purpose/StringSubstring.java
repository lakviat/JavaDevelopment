package Practice_Purpose;

public class StringSubstring {
    public static void main(String[] args) {


    int numbere = 3;
    String word = "Hello world";

    limit(word,numbere);
        System.out.println(word);

    }
    public static String limit (String text, int maxlength){


        System.out.println(text.substring(maxlength));
        return text;
    }
}
