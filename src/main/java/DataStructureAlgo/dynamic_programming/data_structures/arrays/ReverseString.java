package DataStructureAlgo.dynamic_programming.data_structures.arrays;

public class ReverseString {

  public static String ReverseString(String string) {
    String result = ""; //It's more recommended to use "StringBuilder" object when manipulating strings
    final int length = string.length();
    for (int i = length - 1; i >= 0; i--) {
      result += string.charAt(i);
    }
    return result;
  }

  public static String ReverseStringWithReelJava(String string) {
    return new StringBuilder(string).reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(ReverseString("123456"));
    System.out.println(ReverseStringWithReelJava("123456"));
  }
}
