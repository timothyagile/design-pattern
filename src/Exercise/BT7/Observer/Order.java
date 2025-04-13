package Exercise.BT7.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String status;

    public void registerCustomer(Subscriber customer) {
        subscribers.add(customer);
    }

    public void removeCustomer(Subscriber customer) {
        subscribers.remove(customer);
    }

    private void notifyCustomers() {
        for (Subscriber customer : subscribers) {
            customer.update(status);
        }
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Cập nhật trạng thái đơn hàng: " + newStatus);
        notifyCustomers();
    }

}
