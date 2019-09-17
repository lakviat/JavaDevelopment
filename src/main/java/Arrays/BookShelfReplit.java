package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;
public class BookShelfReplit {
    public static void main(String[] args) {




        String word = "at";

        String[] Articles = {"a", "an", "the", "at", "by", "in", "into", "near", "of", "on", "to", "than",};
        String[] arr1 = word.split(" ");
        for (String a : Articles) {
            for (String b : arr1) {
                if (b.equalsIgnoreCase(a)) {
                    System.out.println("Found");
                }else {
                    System.out.println("Not found");
                }
            }
            }
        }
    }



