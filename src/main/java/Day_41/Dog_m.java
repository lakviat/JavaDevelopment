package Day_41;

import javax.sound.midi.Soundbank;

public class Dog_m {

    //Custom DataType, Custom Classes in Java, first one is primitive and Objectives
    //Custom Datatypes has two types one is primitives another one is Objectives
    //Custom DataTypes can me made in Java, just like we have custom command in
    //Medstart, so we can manage the enviroment and make ease workflow
    //One class can have two things in Java, first one is
    // 1 variables
    // 2 methods
    //Local Variables = it needs to be initialized before we use it
    //Instance Varialbe don't have to initialized, but class level has to be initialized

    String breed;
    int size;
    int age;

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sit() {
        System.out.println("Dog is sitting");
    }
    public void eat(String food){
        System.out.println("Dog is eating" + food);
    }

}



