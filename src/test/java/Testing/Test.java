package Testing;

public class Test {
    public static void main(String[] args) {
        int [] arr2 = {10,20,30,40,50,40};
        for (int i = 0; i <arr2.length; i++) {
            boolean duplicates = false;
            for (int j = 0; j <arr2.length ; j++) {
                if(i != j && arr2[i] == arr2[j]){
                    duplicates = true;
                    break;
                }

            }
            if(duplicates == true) {
                System.out.println(arr2[i]);
            }
        }
    }
}
