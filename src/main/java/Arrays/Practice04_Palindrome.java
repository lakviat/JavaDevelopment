package Arrays;

public class Practice04_Palindrome {
    public static void main(String[] args) {
    String name2 = "12civic12";
    ispolindrome(name2);

        System.out.println(ispolindrome(name2));

    }
        public static boolean ispolindrome (String name) {
        String str = "";
            for (int i = name.length()-1; i>=0; i--) {
                str += name.charAt(i);

                // str = str = name.chartAt(i);
            }
            if(!str.equals(name)){
                return false;
            }else{
                return true;
            }






            }
        }

