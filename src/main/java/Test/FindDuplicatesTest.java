package Test;

public class FindDuplicatesTest {

    public static void main(String[] args) {

        int [] number = {10,20,30,40,50,60,10};

        for(int i =0; i< number.length; i++){
            boolean duplicates = true;
        for(int j = 0; j < number.length; j ++){
            if (i == j && number[i] == number[j]){
                System.out.println(number[i]);
            }else;
            System.out.println(number[j]);
        }
        }

    }
}
