package MethodsPractice;
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ConvertINTtoARRAYLIST_ANDVICEVERSA {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60,10};
        int num = 10;

        List<Integer> listnumbers = new ArrayList<Integer>();
        for(int newnum : numbers){
            listnumbers.add(newnum);

        }
        listnumbers.add(100);
        System.out.println(listnumbers);


        List<Integer> listnumbers2 = new ArrayList<Integer>();
        listnumbers2.add(num);


            }

        }





