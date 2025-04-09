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
        String str = "babad"; // Expected -> bab -> aba
        String str2 = "ac";   // Expected -> a
        String str3 = "abb"; // Expected -> bb

        // abb
        // bba
        LongestPalindromeString(str);
        LongestPalindromeString(str2);
        LongestPalindromeString(str3);

    }

    public static void LongestPalindromeString(String s) {
        String reversed = "";
        String palindromeString = "";

        // Reversing string for comparison
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        // find duplicate chars that are followed next right after
        for (int i = 0, j = 1; i < s.length(); i++) {
            if(s.charAt(i) == reversed.charAt(j)){
                palindromeString = palindromeString + s.charAt(i);
                break;
//                j = s.length() -1;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reversed.charAt(i)) {
                palindromeString = palindromeString + s.charAt(i);
            }
            if(reversed.length() <= 2 && s.charAt(i) != reversed.charAt(i)){
                palindromeString = palindromeString + s.charAt(0);
            }
        }
        System.out.println(palindromeString);
    }
}





















