package Arrays;
import java.util.Random;
public class Post2 {
    public static void main(String[] args) {
      Post posting = new Post();
      Random ran = new Random();

      posting.Body6(ran.nextInt(3000));

        System.out.println(posting.Body6());

        posting.setBody("Today is a great day");
        posting.setBody3(10);

    }
}
