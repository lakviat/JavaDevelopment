package Arrays;

public class Practice_Purpose7 {

    public static void main(String [] args) {
        String hello = "Hello, world What is your name ";
        String  hello2 = "Hello world 2 and my";
        strinwors(hello);
        stringwords2(hello2);

    }

        public static String strinwors (String input1){

            for (int i = 0; i <input1.length() ; i++) {
                String [] splitString = input1.split(" " );
                splitString.equals(input1.split(","));
                System.out.print(splitString[i]);

            }

        return input1;
        }

        public static String stringwords2 (String input2){


        return input2;
        }


    }














