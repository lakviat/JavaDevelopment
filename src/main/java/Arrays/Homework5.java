package Arrays;

import java.util.Arrays;
public class Homework5 {
    public static void main(String[] args) {
//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//        Create another array fewValues and copy words that have letter "e" in them
//        You need to know how many element contain "e" and create array accordingly
//        Values in fewValues array need to be["zero", "one","three"]
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        String fewValues = "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].contains("e")) {
                System.out.println(numbers);

            }
        }
        
    }
}
