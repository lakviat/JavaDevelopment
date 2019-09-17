package Arrays;

public class PostHW {

    String name;
    String color;
    int date;

    public String asString(String name, String color, int date) {
        System.out.println("name: " + name );
        System.out.println("color: " + color);
        System.out.println("date: " + date);
        return asString(name,color,date);
    }
}




