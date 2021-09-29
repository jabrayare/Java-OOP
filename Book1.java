import java.util.ArrayList;
import java.util.Arrays;

public class Book1 extends Book1AbstructClass {
//    List<String> books;
    public Book1(String title, String author) {
        super(title, author);
    }

    private static final ArrayList<String> books;

    static {
        books = new ArrayList<>();
    }


    // The admins add a book to the list.
    public void addBooks() {
        this.books.add(new Book1(this.title(), this.author()).title());
    }

    // print all the books
    public boolean printAllBooks(){
        System.out.println(Arrays.toString(books.toArray()));
        return true;
    }

    @Override
    public void checkout(String title) {
        if (this.books.contains(title)){
            books.remove(title);
        }
        else{
            System.out.println("Book is not available at this time!!!");
        }
    }

    @Override
    public void checkIn(String title) {
        if (!this.books.contains(title)){
            books.add(title);
        }
        else{
            System.out.println("You need to checkout a book first!");
        }
    }
    @Override
    public boolean available(String title) {
        return this.books.contains(title);
    }
}
