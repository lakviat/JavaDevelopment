package CodingAssessments;

public class LongestPalindrome {

    /**
     * Example 1:
     * <p>
     * Palindrome string is when you can reverse a string it will have same chars
     * <p>
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * <p>
     * Input: s = "cbbd"
     * Output: "bb"
     */

    public static void main(String[] args) {
        String str = "babad";

        LongestPalindromeString(str);

    }

    public static void LongestPalindromeString(String s) {
        String reversed = "";
        String palindromeString = "";

        // Reversing string for comparison
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reversed.charAt(i)) {
                palindromeString = palindromeString + s.charAt(i);
            }
        }
        System.out.println(palindromeString);
    }
}





















