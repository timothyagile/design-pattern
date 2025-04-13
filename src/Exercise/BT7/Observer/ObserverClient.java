package Exercise.BT7.Observer;

public class ObserverClient {
    public static void main(String[] args) {
        Order order = new Order();

        Customer customer1 = new Customer("Nguyễn Văn A");
        Customer customer2 = new Customer("Trần Thị B");

        order.registerCustomer(customer1);
        order.registerCustomer(customer2);

        order.updateStatus("Đang chuẩn bị");
        order.updateStatus("Đã sẵn sàng để giao");
        order.updateStatus("Đang giao hàng");

        customer1.displayStatus();
        customer2.displayStatus();
    }
}
