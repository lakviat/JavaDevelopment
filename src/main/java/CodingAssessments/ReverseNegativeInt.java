package CodingAssessments;

public class ReverseNegativeInt {
    /**
     * Example 1:
     * <p>
     * Input: x = 123
     * Output: 321
     * Example 2:
     * <p>
     * Input: x = -123
     * Output: -321
     * Example 3:
     * <p>
     * Input: x = 120
     * Output: 21
     *
     * @param args
     */
    public static void main(String[] args) {
        int neg_num = -123;
        int pos_num = 123;

        // Convert the negative number to a positive number for reversal
        int positiveNum = Math.abs(neg_num);

        // Reverse the positive number
        int negative_number = reverseNumber(positiveNum);
        int positive_number = reverseNumber(pos_num);

        // Convert the reversed positive number back to a negative number if the original was negative
        if (neg_num < 0) {
            negative_number *= -1;
        }

        // Print the reversed number
        System.out.println("Negative number reversed : " + negative_number);
        System.out.println("Positive number reversed : " + positive_number);
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}