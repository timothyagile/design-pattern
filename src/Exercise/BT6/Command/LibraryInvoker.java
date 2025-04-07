package Exercise.BT6.Command;

import Exercise.BT6.Command.Command.Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LibraryInvoker {
    private Queue<Command> commands = new LinkedList<>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void execute() {
        while(!commands.isEmpty()) {
            commands.poll().execute();
        }

    }
}
