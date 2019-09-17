package Constructors;

public class Human {
    String name;
    String lastname;
    String eyecolor;
    String haircolor;
    int passportnumber;
    int age;
    int height;


    public void speak(String name, String lastname, String eyecolor, String haircolor, int passportnumber, int age, int height){
        System.out.println("This is humans first speech");
        System.out.println("My name is " + name);
        System.out.println("My last name is " + lastname);
        System.out.println("My eyecolor is " + eyecolor);
        System.out.println("My hair color is " + haircolor);
        System.out.println("My passport number is " + passportnumber);
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
    }
    public void eat (){
        System.out.println("I'm eating right now ");
    }
    public void walk () {
        System.out.println("I'm walking right now");
    }
}
