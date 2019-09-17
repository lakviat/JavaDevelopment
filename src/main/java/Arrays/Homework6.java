package Arrays;

public class Homework6 {
    public static void main(String[] args) {
//        Given the array words, it will print the word with the largest length.
//        Assume that there are no 2 words with longest length
//
//        Example:
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//        prints jaaaaavvaaaaaaaaaa

        String [] words = {"aaa","bbbb","whatupppp","longg","jaaaaavvaaaaaaaaaa","Hello"};
        for (int i = 0; i < words.length-1 ; i++) {
            String longest = "";
            if (words[i].length() > words[i+1].length()) {
                longest = words[i];

                System.out.println(longest);
            }
            }

        }


    }

