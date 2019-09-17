//package Arrays;
//import java.util.Arrays;
//public class Esen7 {
//    public static void main(String[] args) {
//
//
//
//                // We are calling our first custom method here
//                int[] num = { 1, 2, 3, 4 };
//                int num1 = 10;
//                int[] j = ReturnIntegerArray(num, num1);
//                System.out.println(Arrays.toString(j));
//
//                // We are calling our second custom method here
//                char[] character = CharArrayReturn(“James”);
//                System.out.println(Arrays.toString(character));
//
//                // We are calling our third custom method here
//                String[] names = {“James”, “john”, “Adam”, “Brian”};
//                int number = 5;
//                StringReturn(names, number);
//
//
//                printElements(1,2,3,4,5,6,7,8);
//
//            }
//
//            /*
//             * 1. Create method that accepts integer array and integer(target value) and
//             * returns integer array. Logic: Method should initialize all the elements with
//             * given target integer value. Input: [1,4,23,4,0], 10 Output: [10,10,10,10,10]
//             */
//
//            public static int[] ReturnIntegerArray(int[] number, int target) {
//                int[] newNum = new int[number.length];
//                for (int i = 0; i < number.length; i++) {
//                    newNum[i] = target;
//                }
//                return newNum;
//
//            }
//            /*
//             * 2. Create method that accepts String and returns character array. Input:
//             * “James” Output: [j, a, m, e, s]
//             */
//
//            public static char[] CharArrayReturn(String str) {
//                char[] newChar = new char[str.length()];
////        for (char i :str.charAt(index)) {
////
////        }
//                for (int i = 0; i < str.length(); i++) {
//                    newChar[i] = str.charAt(i);
//                }
//
//                return newChar;
//            }
//            /*
//             * 3. Create method that accepts String array and integer (size) that prints out
//             * Strings with the given size. Input: [“James”, “john”, “Adam”, “Brian”], 5
//             * Output: James
//             */
//
//            public static void StringReturn(String[] array, int size) {
//                for (int i = 0; i < array.length; i++) {
//                    if (array[i].length() == size) {
//                        System.out.println(array[i]);
//                    }
//                }
//            }
//            //Var args
//            public static void printElements(int... nums1) {
//                for (int n:nums1) {
//
//                }
//                System.out.println(Arrays.toString(nums1));
//            }
//
//        }
//
//
