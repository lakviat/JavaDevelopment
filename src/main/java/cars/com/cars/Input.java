package cars.com.cars;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Input {
    public static void main(String[] args) {
        com car = new com();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter make: ");
        car.make.equals(scan.nextLine());

        System.out.println("Please enter model: ");
        car.model.equals(scan.nextLine());

        System.out.println("Please enter year: ");
        car.year = scan.nextInt();

        System.out.println("Please enter engine: ");
        car.engine = scan.nextInt();

        System.out.println(" Your car is: " + car);


    }
}
