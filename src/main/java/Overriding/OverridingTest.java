package Overriding;

class Dog{
    // Overriding has same name same parameters
    // Main thing here overriding can't happen in the same class
    // that has to be different classes
    public void bark(){
        System.out.println("Initial parameter ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }

    public void bark(){
        System.out.println("Overrided parameter");
    }
}

public class OverridingTest{
    public static void main(String [] args){
        Dog dog = new Hound();
        dog.bark();

    }
}
