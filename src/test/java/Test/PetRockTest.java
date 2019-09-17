package Test;

import Complete_Ones.Duplicate;
import Selenium.Specialized;
import org.junit.Test;

import java.rmi.server.ExportException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PetRockTest {

    @Test
    public void getname() throws Exception {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getname());

    }

    @Test
    public void setname() throws Exception {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.setname("Rocky"));
        if (rocky.getname().equals("Rocy")) {
            System.out.println("It's good");
        } else {
            System.out.println("Not good names not matching");
        }

    }

    @Test
    public void SeleniumValidation() throws Exception {
        String name = "Specialized";
        Specialized spc = new Specialized();

        spc.Specialized(name);


    }
}