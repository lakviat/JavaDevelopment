package Arrays;

public class Homework16 {
    public static void main(String[] args) {
    String [] main = {"Galaxy", "World","Hello","comon"};
    String main2 = "Hello";
    main_String(main,"Hello");
    System.out.println(main_String(main, main2));

    }
    public static int main_String(String [] first, String second){
        int count = 0;
        for (int i = 0; i < first.length ; i++) {
            if(second.equalsIgnoreCase(first[i])){
            count ++;

            }

        }
        return count;
    }


}
