package Inherritance;

public class Zoo2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.name = "Lucky";
        d.age = 4;
        d.eat();
        System.out.println(d.name);


        d.furColor = "Hello";
    }
}
