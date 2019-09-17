package Arrays;

public class Triangle {
    public static void main(String[] args) {

        int size = 0;
        for (int i = size + 1; i < 1 ; i++) {
            for (int j = size; j < i ; j--) {
                System.out.println(" ");
            }
            for (int k = 0; k<  ( 2 * i -1); k++) {
                System.out.println(" , ");
            }
            System.out.println();
        }

    }
}
