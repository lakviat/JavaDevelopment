package Complete_Ones;

public class MissingNumbers {
    public static void main(String[] args) {

        // This function finds missing numbers in int arr

        int numbers[] = {1, 2, 3, 7, 8, 9, 10};
            int missing_number = numbers[0];

            for (int i = 0; i < numbers.length; i++) {

                do {
                    if (numbers[i] != missing_number) {
                        System.out.println(" " + missing_number);
                        missing_number++;

                    }
                } while (numbers[i] != missing_number);
                missing_number++;
            }
        }
    }




