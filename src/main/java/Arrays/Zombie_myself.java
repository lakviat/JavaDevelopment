package Arrays;
import java.sql.Array;
import java.util.Arrays;
public class Zombie_myself {
    public static void main(String[] args) {

        int [] population = {12,6000,0,65,0,78,90,6};
        for (int i = 0; i < population.length; i++) {
            while(population [i] > 0)

            for (int j = 0; j < population.length ; j++) {
                if(population[j] == 0){
                    if( j == 0){
                        population[j +1 ] = population [j + 1] /2;
                    }else if(j == population.length -1){}
                    population[j -1] = population [j -1] /2;
                    }else
                    population[j+1] = population [j + 1] /2;
                    population[j -1] = population[j -1]/2;

            }
            System.out.println(Arrays.toString(population));
        }
    }
}
