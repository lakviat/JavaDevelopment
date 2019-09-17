package Complete_Ones;

public class TestCase {
    public static void main(String[] args) {
        String name = "Shirin";
        String numbers = "12344555";
        String totalname = "";
        for (int i = 0; i < name.length(); i++) {
            totalname += name.charAt(i);
            totalname += numbers.charAt(i);
        }
        System.out.println(totalname);
    }
}
