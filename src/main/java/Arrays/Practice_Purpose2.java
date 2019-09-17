package Arrays;

public class Practice_Purpose2 {
    public static void main(String[] args) {
        String[] names = {"James", "john", "John Wick", "Elize"};
        add(names);

    }


    public static String[] add(String[] input) {
        String newname = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(" ")) {
                newname = input[i];
                System.out.println(newname);
            }

        }
        return input;
    }
}

