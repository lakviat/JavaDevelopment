package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Practice02_ToLoginMeThod {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
     String [] login = {"johnJava"};
     int [] password = {1,2,3,4,5};



     Login_method(login);

     pass(password);


    }
    public static void Login_method (String [] login){
        System.out.println("Please enter account name: ");

        if(login.equals("johnJava")){
            System.out.println("login Successfull: ");
        }


    }
    public static int [] pass (int [] pass2){
        System.out.println("Please enter password: ");
        if(pass2.equals(123456)){
            System.out.println("login successfull");
        }



            return pass2;
    }
}
