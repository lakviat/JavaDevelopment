package CodingAssessments;

public class LongestSubstring {
        public static void main(String[] args)
        {
            String str = "abcabcbb";
            String test = "";
            // Result
            int maxLength = -1;

            // Return zero if string is empty
            if (str.isEmpty()) {
                System.out.println("is empty");
            }
            // Return one if string length is one
            else if (str.length() == 1) {
                System.out.println("is equals 1 ");
            }
            for (char c : str.toCharArray()) {
                String current = String.valueOf(c);

                // If string already contains the character Then substring after repeating character
                if (test.contains(current)) {
                    test = test.substring(test.indexOf(current) + 1);
                }

                test = test + String.valueOf(c);
                maxLength = Math.max(test.length(), maxLength);
            }
            System.out.println("The length of the longest "
                    + "non-repeating character "
                    + "substring is " + maxLength);
        }
}
