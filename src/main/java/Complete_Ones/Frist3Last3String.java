package Complete_Ones;

public class Frist3Last3String {
    public static void main(String[] args) {
        String total = "";
        String word = "Hello world";
        int n = 0;
        for (int i = 0; i <word.length() ; i++) {
            total = word.substring(0,3);
            total = total + word.substring(word.length()-n);


        }
        System.out.println(total);
    }
}
