package Complete_Ones;

import java.util.HashMap;

public class CountNumOfChars {

        public static void countChars (String s){

            HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
            for (char c : s.toCharArray()){
                if(charmap.containsKey(c)){
                    charmap.put(c,charmap.get(c)+1);
                }else{
                    charmap.put(c,1);
                }
            }
            System.out.println(charmap);
        }

    public static void main(String[] args) {
        countChars("abracadabra");

    }
    }







