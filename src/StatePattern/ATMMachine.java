package StatePattern;

public class ATMMachine {
    private ATMState currentState;
    private int cashInMachine;

    public ATMMachine(int initialCash) {
        this.cashInMachine = initialCash;
        this.currentState = new NoCardState(this);
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(int cash) {
        this.cashInMachine = cash;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

}
