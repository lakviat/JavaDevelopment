package Overriding;

public class TestingOverriding {

    public void bark(){
        System.out.println("Not Overrided");
    }


}
class Testing extends TestingOverriding{
    public void bark() {
        System.out.println("Overrided");
    }


    public static void main(String[] args) {
        TestingOverriding tst = new Testing();
        tst.bark();
    }
}