package Day_41;

public class ComputerChild {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.model = "Macbook Pro";
        c1.color = "Whie";
        c1.isNew = true;
        c1.memory = 256;
        c1.size = 16;

        c1.Turnon();
        c1.Turnoff();


        Computer c2 = new Computer();
        c2.model = "Dell ";
        c2.Turnoff();




        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "James";
        s1.age = 40;
        s1.email = "James@gmail.com";

        s2.name = "adam";
        s2.age = 30;
        s2.email = "adam@gmail.com";

        s1.read();
        s2.read();


        Book book = new Book();
        book.author = "Mark Devine";
        book.title = "Unbeatable mind";
        book.pages = 400;

        s1.read(book);


    }
}
