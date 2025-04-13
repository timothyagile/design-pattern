package Exercise.BT7.State;

public class StateClient {
    public static void main(String[] args) {
        Lawsuit lawsuit = new Lawsuit();

        lawsuit.printStatus();
        lawsuit.nextState();

        lawsuit.printStatus();
        lawsuit.nextState();

        lawsuit.printStatus();
        lawsuit.nextState();

        lawsuit.printStatus();
        lawsuit.nextState();
    }
}
