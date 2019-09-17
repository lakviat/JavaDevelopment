package Encapsulation;

public class Headphones2 {
    public static void main(String[] args) {
        Headphones p = new Headphones();
        p.setPrice(10);
        System.out.println(p.getPrice());

        p.setTypes("ABC");
        System.out.println(p.getTypes());

        p.setSoundQuality("Excellent");
        System.out.println(p.getSoundQuality());
    }
}
