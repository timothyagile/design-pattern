package StatePattern;

public class NoCardState implements ATMState{
    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Thẻ đã được đưa vào. Vui lòng nhập PIN.");
        atmMachine.setState(new HasCardState(atmMachine));
    }

    @Override
    public void ejectCard() {
        System.out.println("Không có thẻ nào trong máy.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Không có thẻ nào trong máy.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Vui lòng đưa thẻ vào trước.");
    }
}
