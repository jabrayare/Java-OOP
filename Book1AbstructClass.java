abstract class Book1AbstructClass implements Book {
  private String title;
  private String author;
  boolean available;

  public Book1AbstructClass(String title, String author){
    this.title = title;
    this.author = author;
    this.available = true;
  }

  @Override
  public String title() {
    return this.title;
  }

  @Override
  public String author() {
    return this.author;
  }

  @Override
  public void checkout(String title) {

  }

  @Override
  public void checkIn(String title) {

  }

}