package CodingAssessments;


import java.util.Random;

public class RandomNumberGen {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <11 ; i++) {
            int k = random.nextInt(100);
            System.out.println(k);
            k = 0;
        }

    }
}
