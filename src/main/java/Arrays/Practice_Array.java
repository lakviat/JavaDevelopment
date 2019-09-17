package Arrays;

public class Practice_Array {
    public static void main(String[] args) {

        String [] kitechenitems = new String[] {"knife", "wooden", "Spoons", "Plates", "cups", "forks", "pan", "pot", };
        for( String kitchen : kitechenitems){
            System.out.println(kitchen);

            if ("knife".equals(kitchen)) {
                System.out.println("This is for cutting the products");

            } else if ("wooden".equals(kitchen)) {
                System.out.println("This is for wooden products");

            } else {
                System.out.println("No correct input");

            }
        }
    }
}
