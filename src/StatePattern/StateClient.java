package StatePattern;

public class StateClient {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(10000); // Máy ATM có 10,000 VND

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(5000);

        System.out.println("\nThử lần tiếp theo:");

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(6000); // Máy không đủ tiền
    }
}
