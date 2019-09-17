package Arrays;
import java.util.ArrayList;
import java.util.List;
public class PostHWChild {
public static void main(String[]args) {

    PostHW n = new PostHW();
    n.name = "Color";
    n.color = "Blue";
    n.date = 1;
    System.out.println(n.asString(n.name,n.color,n.date));
        int sum = 0;
    for (int i = 0; i <6 ; i++) {
        sum = sum +i;
        System.out.println(sum);
    }
}
}


