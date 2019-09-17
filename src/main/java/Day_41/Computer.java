package Day_41;

import javax.sound.midi.Soundbank;

public class Computer {

    String model;
    String color;
    int memory;
    int size;
    boolean isNew;

    public void Turnon (){
        System.out.println("Computer is turning on");
    }
    public void Turnoff (){
        System.out.println(model + "Computer is turning off");
    }
}
