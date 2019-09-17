package Interface;

import java.sql.SQLOutput;

class Maria implements Human {

    int numbers = 20;
    int food = 100;
    int works = 100;

    public void Eat(int a) {

        this.numbers = a;
    }

    public void Sleep(int a) {
        this.food = a;
    }

    public void Work(int a) {
        this.works = a;
    }
    public void PrintStates(){
        System.out.println("eat: " + numbers + "food + " + food + "works " + works);

    }
}
