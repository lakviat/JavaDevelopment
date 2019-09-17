package Inherritance;

public class School extends CondigBootcamp {

    public void hosEvent (int date) {
        System.out.println("Hosting event on " + date);

        CondigBootcamp c = new CondigBootcamp();
        c.name = "Cybertek";
        c.date = 10;
    }
}
