package Arrays;
import java.util.Scanner;
public class HomeworkArray {
    public static void main(String[] args) {

        //populate an int array with numbers from 1 to 10
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }

        int[] b = new int[numbers.length + 1];
        System.out.println(b.length);


        String[] sr = new String[]{"Foo ", " hello", " bar", "world"};

        System.out.println(sr[0] + " " + sr[3]);

        double[] d_r = new double[]{0.2, 0.3, 1.0, 2.0, 1.5};
        System.out.println(d_r[2] + d_r[4]);

        int[] nums = new int[]{5, 4, 3, 7, 8, 11};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        {

            int[] nums1 = new int[]{6, 7, 11, 12, 2, 3};
            int sum = 0;

            for (int x = 0; x < nums1.length; x++) {

                sum = sum + nums1[x];


                System.out.println(sum + " ITS HERE");
            }


            String[] old_r = new String[]{"one", "two", "three"};
            String new_word = "four";
            String[] new_r = new String[old_r.length + 1];

            new_r[0] = old_r[0];
            new_r[1] = old_r[1];
            new_r[2] = old_r[2];
            new_r[3] = new_word;

            System.out.print(new_r [3]);


        }
    }
    }
