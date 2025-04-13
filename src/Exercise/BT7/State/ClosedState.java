package Exercise.BT7.State;

public class ClosedState implements State {
    @Override
    public void nextState(Lawsuit lawsuit) {
        System.out.println("Vụ án đã hoàn tất, không thể thay đổi trạng thái nữa.");
    }

    @Override
    public void printStatus() {
        System.out.println("Trạng thái hiện tại: Đã Hoàn Tất.");
    }
}
