package Complete_Ones;

import java.util.Arrays;

public class PrimeNumbers {
    public  void main(String[] args)  {

        for (int k = 1; k < 101; k++) {
            int num = k;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }

    }

        }





