package CodingAssessments;

public class StringReverseEachChar {
    public static void main(String[] args) {

        String words = "What is the world look like civic";
        String reveres = "";
        String[] NewArray = words.split(" ");
        for (int i = 0; i < NewArray.length; i++) {
            reveres = reveres + NewArray[NewArray.length - i - 1];
        }
        System.out.println(reveres);
    }
}
