package Exercise.BT7.State;

public class WaitingJudgmentState implements State {
    @Override
    public void nextState(Lawsuit lawsuit) {
        System.out.println("Vụ án chuyển từ Chờ Phán Quyết sang Đã Hoàn Tất.");
        lawsuit.setState(new ClosedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Trạng thái hiện tại: Chờ Phán Quyết.");
    }
}
