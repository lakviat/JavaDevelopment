package TASK;

public class Vehicle {
    String type;
    String color;
    int year;
    boolean isNew;

    String name;
    int age;
    static boolean catDisease;

    {
        name = "Nick";
        age = 10;
        catDisease = false;
    }
    static  {
        System.out.println("This is being print out from the static" + catDisease);
        catDisease = false;

    }



    public void  StartEngine () {
        System.out.println("Engine is starting: ");
    }

    public void StopEngine (){
        System.out.println("Engine is stopping: ");
    }
    public static void FixVehicle (int date) {
        System.out.println("Vehicle is getting fixed on " + date);
    }

}
