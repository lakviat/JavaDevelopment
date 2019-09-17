package Day_42_Constructor;

public class Cat {


        String gender;
        String breed;
        int age;



        String color;
        String behaviour;
        boolean shy;



        public Cat(String gender1, String breed1, int age1){
            gender = gender1;
            breed = breed1;
            age = age1;
        }


        public Cat(String gender1, String breed1){
            System.out.println("Cat constructor is getting called");
            gender = gender1;
            breed = breed1;

        }
        public void eat(){
            System.out.println("Cat is eating: ");
        }

        public void eat (String gender){
            System.out.println("Cat is eating but don't know");
        }



}

