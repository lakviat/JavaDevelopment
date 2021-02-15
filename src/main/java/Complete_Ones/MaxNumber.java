package Complete_Ones;

import cucumber.api.java.it.Ma;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        // This function finds maximum number in in arr

        int[] num = {10, 20, 30, 40, 70};
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }
        }
        System.out.println(max);
    }
}
