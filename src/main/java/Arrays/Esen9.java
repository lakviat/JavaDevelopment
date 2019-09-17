package Arrays;
import java.util.Arrays;
public class Esen9 {
    public static void main(String[] args) {

   String mainname = "Hello world";
   cut(mainname,1);

    }

    public static void cut (String name, int hello){

    name = name.substring(hello);
        System.out.println(name);

    }

}
