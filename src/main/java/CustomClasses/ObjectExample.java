package CustomClasses;
import java.util.Random;
import java.util.function.Function;

public class ObjectExample {
    public static void main(String[] args) {

        String s = "James";
        Random r = new Random();

        CustomClassIphone Iphone = new CustomClassIphone();
        Iphone.model = "Iphone 8 plus";
        Iphone.memory = 64;

        System.out.println(Iphone.memory);
        System.out.println(Iphone.model);

        CustomClassIphone KamilsIphone = new CustomClassIphone();
        KamilsIphone.model = "samsung";
        KamilsIphone.memory = 128;
        KamilsIphone.color = "Gold";

        System.out.println(KamilsIphone.model);

        Iphone = KamilsIphone;

        System.out.println(Iphone.model);


        //public static void printPhoneinfo (CustomClassIphone) {
            System.out.println("Model: " + KamilsIphone.model);
            System.out.println("Memory: " + KamilsIphone.memory);
            System.out.println("Color: " + KamilsIphone.color);
        }
    }
