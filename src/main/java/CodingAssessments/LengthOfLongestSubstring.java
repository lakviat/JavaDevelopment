package CodingAssessments;

public class LengthOfLongestSubstring {

/**
 *     substring without repeating characters.
 *
 *      Example 1:
 *
 *     Input: s = "abcabcbb"
 *     Output: 3
 *     Explanation: The answer is "abc", with the length of 3.
 *     Example 2:
 *
 *     Input: s = "bbbbb"
 *     Output: 1
 *     Explanation: The answer is "b", with the length of 1.
 *     Example 3:
 *
 *     Input: s = "pwwkew"
 *     Output: 3
 *     Explanation: The answer is "wke", with the length of 3.
 *     Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
    public static void main(String[] args) {
        String s = "abcabcbb";
        findLongestSubstring(s);
    }

    private static void findLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (right != s.indexOf(s.charAt(right), left)) {
                left++;
            }
            length = Math.max(length, right - left + 1);
        }
        System.out.println("This length is " + length);
    }
}