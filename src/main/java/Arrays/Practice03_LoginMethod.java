package Arrays;
import java.util.Scanner;
public class Practice03_LoginMethod {

    public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);


    }
        public static void login(String givenID, String givenPassword){
        String expectedID = "johnJava";
        String expectedPassword = "123456";

            System.out.println("You have pressed login button: ");
            System.out.println("Please enter username: ");

            Scanner scan = new Scanner(System.in);
            givenID = scan.nextLine();

            System.out.println("Please enter password: ");
            givenPassword = scan.nextLine();

            if(expectedID.equalsIgnoreCase(givenID) && expectedPassword.equalsIgnoreCase(givenPassword)){
                System.out.println("Your login successfull: ");
            }else if(expectedID.equals(givenID) || !expectedPassword.equals(givenPassword)){
                System.out.println("Either the password or the account is not correct: ");
            }
        }

}
