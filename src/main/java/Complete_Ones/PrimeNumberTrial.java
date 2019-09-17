package Complete_Ones;

public class PrimeNumberTrial {
    public static void main(String[] args) throws Exception {


        for (int i = 1; i < 101; i++) {
            int num = i;
            boolean flag = false;
            for (int j = 2; j <= num / 2; ++j) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Is a prime number : " + num);
            } else
                System.out.println("Is not a prime number: " + num);
        }
    }
    public void Duplicates2(){
        int [] numbers = {10,20,30,40,0,10,30,40};
        for (int i = 0; i <numbers.length ; i++) {
            boolean flag = true;
            for (int j = 0; j < numbers.length ; j++) {
                if(i != j && numbers[i] == numbers[j]){
                    flag = false;
                    break;
                }

            }
            if(flag = true){
                System.out.println(numbers[i]);
            }

        }
    }

}




