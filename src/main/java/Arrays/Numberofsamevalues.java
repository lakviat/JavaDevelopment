package Arrays;

public class Numberofsamevalues {
    public static void main(String[] args) {
        String one  = "HellocodeHelloxyz";
        String two = "Hello";
        one.equalsIgnoreCase(one);
        two.equalsIgnoreCase(two);
        char c = 0;
        for (int i = 0; i < one.length()-1; i++) {

            if(one.substring(one.charAt(i)).equalsIgnoreCase("xyz")){
                System.out.println("found");
            }else {
                System.out.println("not found");
            }

            }
        }
        }








