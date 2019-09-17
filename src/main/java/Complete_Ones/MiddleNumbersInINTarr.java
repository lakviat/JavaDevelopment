package Complete_Ones;

public class MiddleNumbersInINTarr {
    public static void main(String[] args) {

        //this methods return the average sum in the array of int

        int[] num = {7,2,10,9};
        int min_number = num[0];
        int max_number =num[1];
        for (int i = 0; i <num.length; i++) {
            if(num[i] < min_number){
                min_number = num[i];

            }else{
                for (int j = 0; j <num.length; j++) {
                    if(num[i] > max_number){
                        max_number = num[i];
                    }
                }
            }
        }
        System.out.println("This is max number: " + max_number);
        System.out.println("This is min number: " + min_number);
        System.out.println("this is median number: " + (max_number - min_number) /2 );


    }
}