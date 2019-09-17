package Practice_Purpose;


public class ReversePractice {
    public static void main(String[] args) {


        String hel = "What is word";
        String reversed = "";
        for (int i = hel.length() -1; i >= 0 ; i--) {
            System.out.print(hel.charAt(i));
        }
    }
}
