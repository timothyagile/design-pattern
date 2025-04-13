package Exercise.BT7.State;

public class FilingState implements State{
    @Override
    public void nextState(Lawsuit lawsuit) {
        System.out.println("Vụ án chuyển từ Khởi Kiện sang Đang Xét Xử.");
        lawsuit.setState(new TrialState());
    }

    @Override
    public void printStatus() {
        System.out.println("Trạng thái hiện tại: Khởi Kiện.");
    }
}
