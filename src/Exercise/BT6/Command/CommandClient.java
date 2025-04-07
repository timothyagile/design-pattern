package Exercise.BT6.Command;

import Exercise.BT6.Command.Command.BorrowBookCommand;
import Exercise.BT6.Command.Command.Command;
import Exercise.BT6.Command.Command.RenewBookCommand;
import Exercise.BT6.Command.Command.ReturnBookCommand;

public class CommandClient {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Programming");
        Book book2 = new Book("B002", "Design Patterns");
        Book book3 = new Book("B003", "Data Structures");
        Book book4 = new Book("B004", "Database");

        LibraryUser user1 = new LibraryUser("U001", "Alice");
        LibraryUser user2 = new LibraryUser("U002", "Bob");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.addUser(user1);
        library.addUser(user2);

        Command cmd1 = new BorrowBookCommand("B001", "U001", library);
        Command cmd2 = new BorrowBookCommand("B001", "U002", library);
        Command cmd3 = new BorrowBookCommand("B002", "U002", library);
        Command cmd4 = new ReturnBookCommand("B001", "U001", library);
        Command cmd5 = new RenewBookCommand("B002", "U002", library);

        LibraryInvoker invoker = new LibraryInvoker();

        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);
        invoker.setCommand(cmd3);
        invoker.setCommand(cmd4);
        invoker.setCommand(cmd5);
        invoker.execute();

    }
}
