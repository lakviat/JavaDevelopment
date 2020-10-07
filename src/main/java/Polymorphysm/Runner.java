package Polymorphysm;

public class Runner {

    public static void main(String[] args) {

        // This is a reprasantation of Polymorphysm, it can trigger
        // multiple methods within polymorphysm with same method names
        // but methods should extend to the super class
        // and if child class doesnt have method it will trigger the super class method


        //in this example Tuna extends Food but if we remove method from Tuna
        //method from the Food will be executed

        Tuna obj = new Tuna();
        obj.eat();

    }

}



