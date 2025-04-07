package Exercise.BT6.Command;

public class Book {
    private String bookId;
    private String bookName;
    private boolean isAvailable;

    public Book(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
