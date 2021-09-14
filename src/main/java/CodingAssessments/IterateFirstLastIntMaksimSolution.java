package CodingAssessments;

public class IterateFirstLastIntMaksimSolution {

    public static void main(String[] args) {
        int[]arr={10,20,30};
        if(arr.length%2!=0) {
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.print(arr[i] + "," + arr[arr.length - i - 1] + ",");
            }
            System.out.println(arr[arr.length / 2]);
        }
        else{
            for (int i = 0; i < arr.length /2; i++) {
                System.out.print(arr[i] + "," + arr[arr.length - i - 1] + ",");
            }

        }
    }
}
