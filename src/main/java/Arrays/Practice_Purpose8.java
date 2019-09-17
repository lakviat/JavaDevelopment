package Arrays;
import java.util.Arrays;
public class Practice_Purpose8 {
    public static void main(String[] args) {
        String words = "Hello, world, helllll,";

        String[] news = words.split(" ");
        for(int i = 0; i < news.length; i++){
            //System.out.print(news[i].charAt(0) +""+news[i].charAt(news[i].length()-2)+ " ");
            System.out.print(news[i].substring(0, 1) +news[i].substring(news[i].length()-2,news[i].length()-1 )+" ");


        }

        }



        }

//
//
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//        for(String word : words){
//            System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
//
//        }
//    }
//
//    //TODO: Write your code below







