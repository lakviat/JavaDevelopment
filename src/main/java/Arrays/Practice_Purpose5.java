package Arrays;
import java.util.Arrays;
public class Practice_Purpose5 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        int target = 10;
        int targetIndex = 3;
        bla(arr, target, targetIndex);
    }

    public static void bla(int[] arr, int target, int targetIndex) {
        int[] newArr = new int[arr.length + 1];
        if (targetIndex < arr.length) {
            int temp = arr[targetIndex];

            for (int i = 0; i < arr.length; i++) {
                if (i > targetIndex) {
                    newArr[i+1] = arr[i];
                } else if (i < targetIndex) {
                    newArr[i] = arr[i];
                } else {
                    newArr[targetIndex] = target;
                    newArr[targetIndex + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(newArr));
        } else if (targetIndex == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = target;
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println("Invalid target index");
        }
    }
    }

