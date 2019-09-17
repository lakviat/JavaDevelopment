package Complete_Ones;

public class FirstAndLastCharsInString {
    public static void main(String[] args) {
        String [] array = {"Hello", "Hi", "world", "what "};
        for (int i = 0; i <array.length /2; i++) {
            String temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;

        }
        System.out.print("here is the output: ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);

        }
    }
}
