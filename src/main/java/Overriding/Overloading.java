package Overriding;

import cucumber.api.java.eo.Do;

//Method Overloading is when you have different parameters but same name method
//Main thing here to make sure it is in the same class or can be extended from different class as well
//Method overloading can have as many as other methods

class Overloading {
        public void bark(int num) {
            System.out.println("Parent method ");
        }
        // this example show it can overloading can happen in the same class
        public void bark(int num, int ext, int p){
            System.out.println("Second parameter ");
        }
        public void bark(int num, int x){
            System.out.println("Method Overloading");
        }
        public void bark(){
            System.out.println("Doesnt have parameters");
        }
    }


    class AnotherName extends Overloading {
        public void bark(int num, int ext) {
            System.out.println("Overloading Parameter");
        }


        public static void main(String[] args) {
            Overloading df = new AnotherName();
            df.bark();
        }
    }







