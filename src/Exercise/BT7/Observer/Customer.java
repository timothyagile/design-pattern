package Exercise.BT7.Observer;

public class Customer implements Subscriber{
    // Context
    private String name;
    private String orderStatus;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        this.orderStatus = status;
        System.out.println(name + " nhận thông báo: Đơn hàng hiện tại " + status);
    }

    public void displayStatus() {
        System.out.println(name + " thấy đơn hàng đang ở trạng thái: " + orderStatus);
    }
}
