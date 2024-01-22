package CodingAssessments;

import java.util.HashSet;
import java.util.Set;

public class DuplicateIntOfArraysUsingHashSet {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 1, 50, 4, 2, 50};

        // Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Set to store duplicates
        Set<Integer> duplicates = new HashSet<>();

        for (int value : num) {
            // If the element is already in the uniqueElements set, it's a duplicate
            if (!uniqueElements.add(value)) {
                duplicates.add(value);
            }
        }
        // Print duplicates
        System.out.println("Duplicates in the array: " + duplicates);
    }
}