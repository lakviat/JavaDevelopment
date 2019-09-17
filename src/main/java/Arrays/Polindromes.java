package Arrays;

public class Polindromes {
    public static boolean main(String[] args) {
        int sum = 0;
        int [] num = {10,20,30,40,2,2};
        for (int i = 0; i <num.length ; i++) {
            if(num[i] == 2){
                sum += num[i];

            }
        }
            if(sum == 8){
                return true;
            }else {
                return false;
            }

    }}
