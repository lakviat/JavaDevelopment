package Arrays;

public class Primes {
    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            int num = i;
            boolean flag = false;
            for (int j = 2; j <= num/2 ; ++j) {
                if(num % j ==0){
                    flag = true;
                    break;
                }


            }
            if(!flag){
                System.out.println(num + "is a prime number");
            }else{
                System.out.println(num + "is not prime number");
            }

        }
    }
}
