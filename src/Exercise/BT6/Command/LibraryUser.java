package Exercise.BT6.Command;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private String userId;
    private String userName;
    private List<Book> borrowList = new ArrayList<>();

    public LibraryUser(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Book> getBorrowList() {
        return borrowList;
    }

    public void addBorrowBook(Book book) {
        this.borrowList.add(book);
    }

    public void removeBorrowBook(Book book) {
        this.borrowList.remove(book);
    }
}
