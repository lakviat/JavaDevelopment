package Encapsulation;

public class Getters {
    public static void main(String[] args) {


        String name = "";
        int numbers = 0;

        Encapsulation n = new Encapsulation();
        n.name  = "Hello";
        n.make = 10;
        n.model = "Hello";
        n.make = 10;
    }
    public void setName( String name, int numbers){
        name = name;
        numbers = numbers;
    }
    public String getName(String name){
        return name;
    }
}
