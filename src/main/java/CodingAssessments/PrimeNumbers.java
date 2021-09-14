package CodingAssessments;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Prime numbers
        for (int k = 1; k < 101; k++) {
            boolean flag = false;
            for (int i = 2; i <= k / 2; ++i) {
                // condition for non prime number
                if (k % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(k + " is a prime number.");
            else
                System.out.println(k + " is not a prime number.");
        }
    }
}





