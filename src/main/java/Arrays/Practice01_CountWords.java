package Arrays;

public class Practice01_CountWords {
    public static void main(String[] args) {

    String [] word = {"Today is a great day"};
    countWords(word);


    }
    public static String [] countWords (String [] input){
        int count = 0;
        String [] totalletter = {""};
        for (int i = 0; i < input.length ; i++) {
            if(input[i].contains(" ")){
            totalletter = input;
                System.out.println(totalletter[i] + ", ");
            count++;


            }

        }

    return input;
    }

}
