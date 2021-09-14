package CodingAssessments;

public class CharDoubleLettersString {
    public static void main(String[] args) {

        // This function duplicates the characters of the string

        String word = "Hello world";
        char c = 0;
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            result = result + c + c;

        }
        System.out.println(result);
    }

}








