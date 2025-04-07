package Exercise.BT6.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> listBook = new HashMap<>();
    private Map<String, LibraryUser> listUser = new HashMap<>();

    void addBook(Book book) {
        listBook.put(book.getBookId(), book);
    }

    void addUser (LibraryUser user) {
        listUser.put(user.getUserId(), user);
    }

    public void borrowBook (String userId, String bookId) {
        Book book = listBook.get(bookId);
        if(book.isAvailable()) {
            book.setAvailable(false);

            LibraryUser user = listUser.get(userId);
            user.addBorrowBook(book);

            System.out.println("Nguoi dung: " + user.getUserName()
                    + " da muon thanh cong sach: " + book.getBookName());
        }
        else {
            System.out.println("Sach: " + book.getBookName() + " da co nguoi muon");
        }

    }

    public void returnBook (String userId, String bookId) {
        Book book = listBook.get(bookId);
        book.setAvailable(true);

        LibraryUser user = listUser.get(userId);
        user.removeBorrowBook(book);

        System.out.println("Nguoi dung: " + user.getUserName()
                + " da tra thanh cong sach: " + book.getBookName());
    }

    public void renewBook (String userId, String bookId) {
        Book book = listBook.get(bookId);
        book.setAvailable(true);

        LibraryUser user = listUser.get(userId);

        System.out.println("Nguoi dung: " + user.getUserName()
                + " da gia han thanh cong sach: " + book.getBookName());
    }
}
