package StatePattern;

public class AuthenticatedState implements ATMState{
    private ATMMachine atmMachine;

    public AuthenticatedState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Bạn đã đăng nhập.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Thẻ đã được lấy ra.");
        atmMachine.setState(new NoCardState(atmMachine));
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Bạn đã nhập PIN rồi.");
    }

    @Override
    public void withdrawCash(int amount) {
        if (amount > atmMachine.getCashInMachine()) {
            System.out.println("Máy ATM không đủ tiền.");
            atmMachine.setState(new OutOfCashState(atmMachine));
        } else {
            System.out.println("Đang rút " + amount + " VND...");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - amount);

            if (atmMachine.getCashInMachine() == 0) {
                atmMachine.setState(new OutOfCashState(atmMachine));
            } else {
                atmMachine.setState(new NoCardState(atmMachine));
            }
        }
    }
}
