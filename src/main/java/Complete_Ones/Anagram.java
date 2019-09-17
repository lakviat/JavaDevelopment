package Complete_Ones;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String firstword = "lena";
        String secondword = "anel";
        System.out.println(isAnagram(firstword,secondword));


    //Anagram is a word that has same lenght, and would have same converting

    }
    public static boolean isAnagram (String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }
            char [] char1 = str1.toCharArray();
            char [] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            for (int i = 0; i <str1.length() ; i++) {
                if(char1[i] != char2[i]){
                    return false;
                }
            }
            return true;

    }
}
