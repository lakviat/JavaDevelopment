package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Zombie_Task {
    public static void main(String[] args) {
        //Zombie homework
        int [] population = {3,60000,0,4000,3,2,7,0};


        for (int i = 0; i < population.length ; i++) {
            while(population [i] > 0){
                for (int j = 0; j < population.length ; j++) {
                    if(population[j] == 0){
                if(j == 0){
                    population[j + 1 ] = population [ j + 1] /2;
                }else if (j == population.length -1){
                    population[j -1] = population [j -1 ] /2;
                }else{
                    population [j + 1] = population [j + 1] /2;
                    population [j - 1] = population [j -1 ]/ 2;
                }

                        System.out.println(Arrays.toString(population));
            }


            }



        }



        }

    }}

