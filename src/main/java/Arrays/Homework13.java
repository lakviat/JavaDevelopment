package Arrays;
import java.util.Arrays;
public class Homework13 {
    public static void main(String[] args) {
                System.out.println("-----EXAMPLE RUN ---------");
                String[] numbers = {"zero", "one", "two","three","four"};
                getWithE(numbers);
            System.out.println(Arrays.toString(numbers));
    }

                public static String[] getWithE(String[] arr) {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].contains("e")) {
                        count++;
                    }
                }
                String[] fewValues = new String[count];

                boolean check = true;
                int i = 0;
                while(i < arr.length ) {
                    i++;
                    if(arr[i].contains("e")){
                        fewValues[i] = arr[i];


                    }
                    }


                return fewValues;
    }}



















