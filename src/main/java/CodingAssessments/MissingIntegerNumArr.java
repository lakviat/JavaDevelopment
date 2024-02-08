package CodingAssessments;

public class MissingIntegerNumArr {
    public static void main(String[] args) {

        // This function finds missing numbers in int arr

        int[] num = {1, 2, 3, 7, 8, 9, 10};
        int missing = num[0];
        for (int i = 0; i <num.length; i++) {
            if(num[i] -i != missing){
                while(missing < num[i] - i){
                    System.out.println((i + missing) + " ");
                    missing++;
                }
            }
        }

    }
}




