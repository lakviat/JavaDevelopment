package CodingAssessments;

public class PolindromeNumber {
    public static void main(String[] args) {

        int numbers = 12349;
        System.out.println(isPolindrome(numbers));

    }

    public static boolean isPolindrome(int num){
        String str = String.valueOf(num);
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.equals(reverse)){
            return true;
        }else return false;
    }
}
