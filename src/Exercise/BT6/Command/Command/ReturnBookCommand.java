package Exercise.BT6.Command.Command;

import Exercise.BT6.Command.Library;

public class ReturnBookCommand extends Command{
    public ReturnBookCommand(String bookId, String userId, Library library) {
        super(bookId, userId, library);
    }

    @Override
    public void execute() {
        library.returnBook(userId, bookId);
    }
}
