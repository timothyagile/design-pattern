package StatePattern;

public class HasCardState implements ATMState{
    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Thẻ đã có trong máy.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Thẻ đã được lấy ra.");
        atmMachine.setState(new NoCardState(atmMachine));
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) { // Giả sử mã PIN đúng là 1234
            System.out.println("Mã PIN chính xác. Bạn có thể rút tiền.");
            atmMachine.setState(new AuthenticatedState(atmMachine));
        } else {
            System.out.println("Sai mã PIN. Vui lòng thử lại.");
            atmMachine.ejectCard();
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Vui lòng nhập mã PIN trước.");
    }
}
