package Abstractions;

import cucumber.api.java.Before;

public class mainmethid {

   public static void Run(){
       System.out.println("WE ARE NOT ABLE TO RUN ");
   }

   public void Bla(){
       mainmethid.Run();
   }

   static {
       System.out.println("Hello");
       mainmethid.Run();
       System.exit(0);
   }


}
