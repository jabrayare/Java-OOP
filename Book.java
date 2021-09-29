import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Book {

    // the title of the book
    String title();
    // The author of the book
    String author();

    // reports whether the book is available.
    boolean available(String title);

    // checks the book out of the library
    public void checkout(String title);

    //checks the book in.
    public void checkIn(String title);

    //adds books by the admin.
    public void addBooks();

    // print all the books
    public boolean printAllBooks();

}
