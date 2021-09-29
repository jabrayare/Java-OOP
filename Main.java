
class Main {
  public static void main(String[] args) {
    Book1 book = new Book1("world's best book", "Ali");
    Book1 book2 = new Book1("world's newest book", "Jibril");
    Book1 book3 = new Book1("world's newest book 2021", "Kaka");
    book.addBooks();
    book2.addBooks();
    book3.addBooks();
    book3.checkout("world's best book");
    System.out.println(book.printAllBooks());
  }
}