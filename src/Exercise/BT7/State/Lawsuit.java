package Exercise.BT7.State;

public class Lawsuit {
    State state;

    public Lawsuit() {
        this.state = new FilingState(); // Bắt đầu với trạng thái "Khởi Kiện"
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.nextState(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
