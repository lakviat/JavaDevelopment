package CodingAssessments;

public class MinNumber {
    public static void main(String[] args) {

        int [] num = {10,20,5,40,81,78,7,597};
        int min = num[0];
        for (int i = 1; i < num.length ; i++) {
            if(num[i] < min){
                min = num[i];

            }
        }
        System.out.println(min);
    }
}
