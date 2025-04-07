package Exercise.BT6.Command.Command;

import Exercise.BT6.Command.Library;

public abstract class Command {
    protected String bookId;
    protected String userId;
    protected Library library;

    public Command(String bookId, String userId, Library library) {
        this.bookId = bookId;
        this.userId = userId;
        this.library = library;
    }

    public abstract void execute();
}
