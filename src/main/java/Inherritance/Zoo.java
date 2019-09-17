package Inherritance;

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.name = "Lucky";
        d.age = 4;
        d.eat();
        System.out.println(d.name);

        d.furColor();
        d.bark();
        SeriviceDog sd = new SeriviceDog();
        sd.bark();

    }
}
