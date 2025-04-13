package StatePattern;

public class OutOfCashState implements ATMState{
    private ATMMachine atmMachine;

    public OutOfCashState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Máy ATM hết tiền. Vui lòng thử máy khác.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Không có thẻ nào trong máy.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Máy ATM hết tiền. Không thể xử lý giao dịch.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Không thể rút tiền. Máy ATM đã hết tiền.");
    }
}
