package by.bsuir;

public class Book implements Comparable{
    private String title;
    private String author;
    private int price;
    private  static  int edition;
    private int isbn;

    public Book(String title, String author, int price, int edition, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        Book.edition = edition;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = title.hashCode() + 29 * result;
        result = author.hashCode() + 29 * result;
        result = price + 29 * result;
        result = edition + 29 * result;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }
        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString() {
        return "title: " + this.title + "\nauthor: " + this.author + "\nprice: " + this.price + "\nedition: " + Book.edition;
    }

    @Override
    protected Object clone() {
        return new Book(title, author, price, edition, isbn);
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(isbn - ((Book) o).isbn, 0);
    }
}
