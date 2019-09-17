package Practice_Purpose;
import java.util.StringJoiner;
import java.util.List;
import java.util.ArrayList;
public class ConvertingStringToStringBuilder {
    public static void main(String[] args) {

        System.out.println(removeCon("Consequences"));

    }
    public static String removeCon(String word){
        word = word.toLowerCase().trim();
        if(word.contains(" ")){
            System.out.println("Invalid data");
            return "";
        }
        else if(word.length() < 3){
            System.out.println("Invalid data");
            return "";
        }
        else if(!word.contains("con")){
            StringBuilder sb = new StringBuilder(word);
            sb.delete(word.indexOf("con"),word.indexOf("con") + 3);
            return sb.toString();
        }
        else {
            return word;

            //review this class for sure !!!!!!

        }
    }
}
