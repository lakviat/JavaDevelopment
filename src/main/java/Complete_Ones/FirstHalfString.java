package Complete_Ones;

public class FirstHalfString {
    public static void main(String[] args) {

       //This method prints out the first half of String
        String word = "Helloword";
        String thefirst = "";
        for (int i = 0; i < word.length(); ++i) {
            thefirst = word.substring(0,word.length() /2 );



        }
        System.out.println(thefirst);
    }
}
