package Exercise.BT7.State;

interface State {
    void nextState(Lawsuit lawsuit);
    void printStatus();
}
