package Exercise.BT6.Command.Command;

import Exercise.BT6.Command.Library;

public class RenewBookCommand extends Command{
    public RenewBookCommand(String bookId, String userId, Library library) {
        super(bookId, userId, library);
    }

    @Override
    public void execute() {
        library.renewBook(userId, bookId);
    }


}
