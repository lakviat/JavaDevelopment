package Complete_Ones;

public class SecondHighestNumberIntArr {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7};
        int temp;
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j <a.length ; j++) {
                if( a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            number = a[a.length -2];
            break;
        }
        System.out.println(number);
    }
}
