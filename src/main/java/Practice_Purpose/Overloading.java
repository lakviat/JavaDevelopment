package Practice_Purpose;
import java.util.Arrays;
public class Overloading {
    public static void main(String[] args) {
        String word2 = "consenquences";
        project(word2,"con");
        System.out.println(word2);


    }
    public static String project (String word, String target ){
        word = word.toLowerCase().trim();

        if(word.contains(" ")){
            System.out.println("invalid data: ");
            return null;
        }
        if(word.length() > 3) {
            System.out.println("invalid data");
            return null;
        }
        if(word.contains("con")){
            StringBuilder strb = new StringBuilder(word);
            strb.delete(0,2);
            return strb.toString();
        }

        return word;
    }
    }

