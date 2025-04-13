package Exercise.BT7.State;

public class TrialState implements State {
    @Override
    public void nextState(Lawsuit lawsuit) {
        System.out.println("Vụ án chuyển từ Đang Xét Xử sang Chờ Phán Quyết.");
        lawsuit.setState(new WaitingJudgmentState());
    }

    @Override
    public void printStatus() {
        System.out.println("Trạng thái hiện tại: Đang Xét Xử.");
    }
}
