package Arrays.Overriding;

public class BasketballPlayer extends Human {
    public static void main(String[] args) {
        Human n1 = new Human();
        n1.run();
        n1.eat();

    }
        @Override
        public void run () {
            System.out.println("This is overrided output");
        }
        @Override
        public void eat () {
            System.out.println("This method is also overrided ");
        }
    }
