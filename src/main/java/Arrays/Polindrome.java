package Arrays;

public class Polindrome {
    public static void main(String[] args) {


    isPolindrome(33488433);


    }
    public static boolean isPolindrome(int num) {


        int reverseNum = 0;
        int copyNum = num;
        do {
            reverseNum += num % 10;
            num /= 10;
            if(num!=0){
                reverseNum*=10;
            }
            System.out.println(reverseNum);
        } while (num != 0);
        if (num == reverseNum) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPalindrome(String s){
    String reverseS = "";



    return false;

    }}
