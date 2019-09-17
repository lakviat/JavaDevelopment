package MethodsPractice;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLIst_PRactice {
    public static void main(String[] args) {


        int [] intnumbers = {10,20,30,40,50};

        ArrayList<Integer> numbers =  new ArrayList();
        Integer [] arraylistnumbs = new Integer[] {10,20,30,40,};

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(arraylistnumbs);
        System.out.println(Arrays.toString(intnumbers));


        plus();

        }
        public static void plus (){
        Scanner scan = new Scanner(System.in);
            System.out.println();
            int first = scan.nextInt();
            System.out.println();
            int second = scan.nextInt();
            int total = first + second;
            System.out.println("result " + total);

        }
    }

