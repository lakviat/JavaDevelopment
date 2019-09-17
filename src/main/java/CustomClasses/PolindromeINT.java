package CustomClasses;
import java.util.ArrayList;
import java.util.Arrays;
public class PolindromeINT {
    public static void main(String[] args) {
        String [] words = {"Hello world", "what the heck"};
            for(int i = words.length-1 ; i >= 0; i--){
                String revers = words[i];
                revers = revers + words[i];
                System.out.println(revers);

                //Split bu StringBuilder
                StringBuilder hello = new StringBuilder();
                hello.append("Hello");
                hello.append("world");
                String reversed = "";
                for(String eachone : words){
                reversed += eachone;
                String n = "waht is the name";
                StringBuilder hel = new StringBuilder(n);
                    System.out.println(hel);

                    String [] newone = {""};
                    newone = n .split(" ");
                    for (int j = 0; j < newone.length ; j++) {
                        System.out.println(newone[j]);
                        String words10 = "";
                        for(String hello10 : newone){
                            words10 += hello10;
                            System.out.println(words10);
                        }

                    }


                }



                //How to convert String into Arrays and Reverse it
                String [] converted = {""};

                String word = "Hello world i love living";
                for (int j = 0; j < word.length(); j++) {
                    converted = word.split(" ");
                }
                for (int k = converted.length -1 ; k <= 0 ; k--) {
                    System.out.println(converted[k] + " ");

                }

            }
            }
        }




