package ApachePoi;

import java.io.FileWriter;
import java.util.List;
import java.util.Random;

public class GenerateRandomNumberToCSVFile {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            int count = 0;
            FileWriter fileWriter = new FileWriter("Testing.csv");
            fileWriter.write(random.nextInt());
            count++;
            if(count == 1000){

            }
        }catch (Exception e){


        }
    }
}
