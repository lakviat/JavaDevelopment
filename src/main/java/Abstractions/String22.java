package Abstractions;

public class String22 {
    public static void main(String22[] args) {
        String name = "Nurlan";
        String number = "123456";
        String result = "";
        for (int i = 0; i <name.length() ; i++) {
            result += name.charAt(i)+number.charAt(i);
        }
        System.out.println(result);
    }
}
