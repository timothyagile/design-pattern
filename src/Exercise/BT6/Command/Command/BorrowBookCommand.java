package Exercise.BT6.Command.Command;

import Exercise.BT6.Command.Library;

public class BorrowBookCommand extends Command{
    public BorrowBookCommand(String bookId, String userId, Library library) {
        super(bookId, userId, library);
    }

    @Override
    public void execute() {
        library.borrowBook(userId, bookId);
    }
}
