edited
class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    Book() {
        bookId = 0;
        bookName = "Unknown";
        authorName = "Unknown";
    }

    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = "Unknown";
    }

    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(101, "Java Programming");
        Book b3 = new Book(102, "OOP Concepts", "James Gosling");

        b1.display();
        b2.display();
        b3.display();
    }
}
