package CodingAssessments;

public class MaxNumber {
    public static void main(String[] args) {

        // This function finds maximum number in in arr

        int[] num = {10, 20, 30, 40, 70,79,06};
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }
        }
        System.out.println(max);
    }
}
