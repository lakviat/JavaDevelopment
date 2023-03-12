package CodingAssessments;

import java.util.Arrays;

public class IterateFirstLastIntArrArifSolutionBest {
        public static void main(String[] args) {

            // Best Solution, Loops contains iteration from the beginning and from the end
            // This function iterates first with the last in the arraylist
            // best solution i think

            int [] array = {10,20,30,40,50,60,70,56,648};
            int [] newArray = new int[array.length];
            int j = 0;
            for (int i = 0, k = array.length-1;  j < array.length;  i++ ,k--) {
                newArray[j++] = array[i];
                if(j < array.length) {
                    newArray[j++] = array[k];
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }

