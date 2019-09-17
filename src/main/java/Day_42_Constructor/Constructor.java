package Day_42_Constructor;

public class Constructor {
        //there is no way to build object without constructor
        //Strudent s = new Student(); this is how Constructor is build

        //Constructor is a spcial kind of method that invoked every time
        //an object is created
        //It has same name as class
        // It does not have a return type


        //Constructor has to be the same name as class, and don't have to have a
        //return type, plus it has to be in the one class, this will be a consturctor
        //Constructors are used to create objects, and set the default values


        public class Cat {
            String gender;
            String breed;
            int age;
            String color;
            String behaviour;
            boolean shy;

        public Cat(String gender1, String breed1){
            System.out.println("Cat constructor is getting called");
            gender = gender1;
            breed = breed1;

        }
          public void eat(){
              System.out.println("Cat is eating: ");
          }
        }

}

