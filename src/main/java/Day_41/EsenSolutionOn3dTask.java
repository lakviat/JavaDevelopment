package Day_41;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class EsenSolutionOn3dTask {
    public static void main(String[] args) {

        List<Book> books = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of books : ");
        int bookNum = scan.nextInt();

        for (int i = 0; i < bookNum ; i++) {
            Book book = new Book();
            System.out.println("Please enter the number of books" + (i+1)+ ":");
            book.author = scan.nextLine();
            System.out.println("Please enter the title of books" + (i+1)+ ":");
            book.title = scan.nextLine();
            System.out.println("Please enter the pages for a book" + (i +1) + ":");
            book.pages = scan.nextInt();
            scan.nextLine();
            books.add(book);
        }
        System.out.println("Size: " +  books.size());
        }
        }

