package Complete_Ones;

public class SentenceReverseArray {
    public static void main(String[] args) {
        String [] words = {"First sentence: ", "Second sentence: "};
        String polindrome = "";
        String reveresed = "";
        for (int i = 0; i < words.length / 2; i++) {
            reveresed = words[i];
            words[i] = words[words.length -i -1];
            words[words.length -i -1] = reveresed;

        }
        System.out.print("Here is the result:  ");
        for (int i = 0; i <words.length ; i++) {
            System.out.print(words[i]);

        }
        }

        }





