package Day_41;

public class Dog {
    public static void main(String[] args) {
        Dog_m dog1 = new Dog_m();
        dog1.breed = "Shepherd";
        dog1.size = 10;
        dog1.age = 5;
        System.out.println("\n" +"Age is: " +dog1.age);
        System.out.println("\n" +"Size is: " + dog1.size);
        System.out.println("\n" +"Breed is: " +dog1.breed);
        dog1.eat("Plov");
    }



    }


