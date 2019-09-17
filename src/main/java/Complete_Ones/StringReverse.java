package Complete_Ones;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String hello = "Java is fun";
        String [] reversed = {""};

        for (int i = 0 ; i <hello.length() ; i++) {
            reversed = hello.split(" ");
        }
            for (int j = reversed.length -1; j >=0  ; j--) {

                System.out.print(reversed[j] + " ");


            }

        }


    }





