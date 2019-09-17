package Inherritance;

public class Student {
    String name;
    int age;
    String location;

    public void study (int course) {
        System.out.println("Studying " + course);
    }
    public boolean takeExam (int num ){
        if(num > 80) {
            return true;
        }
        return false;



    }
}
