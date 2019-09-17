package Constructors;

import Practice_Purpose.Test;

public class TestConstructor {

    void TestConstructor2(String nums) {
        String reversed = "";
        for (int i = nums.length() - 1; i >= 0; i--) {
            reversed += nums.charAt(i);
        }
        System.out.println(reversed);

    }
    public void TestConstructor(){

    }
    void Test2(String numbers) {
        System.out.println("Hello");

    }

    public void TestConstructor(String name, int numbers) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {


        TestConstructor tst = new TestConstructor();
        tst.TestConstructor("Hello", 10);


    }

    public String War(String wars) {
        String reversed = "";
        for (int i = wars.length() - 1; i >= 0; i--) {
            reversed += wars.charAt(i);
            return reversed;
        }
        return reversed;
    }

    public int Comic(String nums, int couple) {
        System.out.println("What the hekk");
        return couple;
    }

    public String length(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
    }




