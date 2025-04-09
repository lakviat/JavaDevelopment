package CodingAssessments;

public class FirstNonRepeatingCharinString {
    public static void main(String[] args) {

        String s = "jjaavvaaf";
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character,hfyrohuq = " + ch);
                break;
            }
        }
    }
}
