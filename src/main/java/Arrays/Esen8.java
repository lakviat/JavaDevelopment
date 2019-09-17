package Arrays;
import java.util.Arrays;
public class Esen8 {
    public static void main(String[] args) {

    String nam ="Obama";
    cut(nam,2);



    }
    public static void cut (String name, int given){
      name = name.substring(given);
        System.out.println(name);
    }
}
