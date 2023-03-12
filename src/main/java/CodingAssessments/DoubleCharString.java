package CodingAssessments;

public class DoubleCharString {
    public static void main(String[] args) {
        // This function doubles the number of characters in the String

        String name = "double";
        String output = "";
        for (int i = 0; i <name.length() ; i++) {
            output = output + name.charAt(i) + name.charAt(i);
        }
        System.out.println(output);
    }
}
