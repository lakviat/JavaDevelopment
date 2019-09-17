package Day_41;

public class Student {
    String name;
    String email;
    int age;

    public void read (){
        System.out.println("Student" + name + "reading");
    }
    public void read (Book book){
        System.out.println("Student " + name + "Is reading " + book.title +"by" + book.author);

    }
}
