package CodingAssessments;

public class CountWordInAString {
    public static void main(String[] args) {
        // Find the index number of second occurrence word needle
        String haystack = "sadbutsad";
        String needle = "sad";

        int firstIndex = haystack.indexOf(needle);
        if (firstIndex != -1) {
            int secondIndex = haystack.indexOf(needle, firstIndex + needle.length());
            System.out.println("Second index start at : " + secondIndex);
        }
    }
}
