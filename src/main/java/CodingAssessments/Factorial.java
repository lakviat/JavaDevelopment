package CodingAssessments;

public class Factorial {
    public static void main(String[] args) {
        // 5! Exclamation mark means Factorial of 5
        // Find factorial of 5 it is important that returning value is not 0 otherwise it won't multiply

        int factorial = 5;
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
