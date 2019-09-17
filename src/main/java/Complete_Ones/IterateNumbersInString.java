package Complete_Ones;

public class IterateNumbersInString {
    public static void main(String[] args) {
        String name = "NUrlan";
        String nums = "123456";
        String total = "";
        for (int i = 0; i <name.length() ; i++) {
            total += name.charAt(i)  ;
            total += nums.charAt(i) + " ";
        }
        System.out.println(total);
    }
}
