package Interface;

public class John implements Human {

    int work = 1000000;
    int eats = 100000000;
    int sleep = 1000000;

    public void Work(int a) {
        this.work = a;
    }

    public void Eat(int a) {
        this.eats = a;
    }

    public void Sleep(int a) {
        this.sleep = a;
    }
public void PrintStates(){
    System.out.println("work " + work + " eats " +eats + "sleep "+ sleep);
}
}
