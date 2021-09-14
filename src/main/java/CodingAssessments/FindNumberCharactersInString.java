package CodingAssessments;

import java.util.HashMap;
import java.util.Map;

public class FindNumberCharactersInString {
    public static void main(String[] args) {
        // This function will find number of character in String

        String str = "jashdfjhdjahdfjahjfah";
        char characters [] = str.toCharArray();
        Map<Character, Integer> counting = new HashMap<>();

        for (Character c  : characters){
            if (counting.containsKey(c)){
                int count = counting.get(c);
                counting.put(c, ++count);
            }else{
                counting.put(c, 1);
            }
        }
        System.out.println("HERE IS THE OUTPUT \n" + counting.toString());
    }
}
