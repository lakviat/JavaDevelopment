package Complete_Ones;

public class Task {
    public static void main(String[] args) {
        String name = "Nurlan";
        String nums = "1234";
        String str = "";
        for (int i = 0; i <name.length() -1 ; i++) {
            str += name.charAt(i);
            str += nums.charAt(i)+ " ";

        }
        System.out.println(str);
    }
}
