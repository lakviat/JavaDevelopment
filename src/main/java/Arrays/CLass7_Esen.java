package Arrays;
import java.util.Random;
import java.util.Arrays;
public class CLass7_Esen {
    public static void main(String[] args) {
        Random random = new Random();

        int [] [] number = new int [4][];
        number[0] = new int [5];
        number[1] = new int [3];
        number[2] = new int [7];
        number[3] = new int [7];

        //assigning a values to an array ---- assign random integers

        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number[i].length; j++){
                System.out.print("i: " + i + "\t" + j);

               number[i][j] = random.nextInt(100);

                // need to print out [ele1] [ele2] this way

                    System.out.println(Arrays.toString(number[i]));
                }

            }
        }


        }

