package state;

import constant.OrderStatus;
import model.Order;

public class ProcessingState implements OrderState {
    public void next(Order order) {
        System.out.println("Đang giao hàng đến khách...");
        order.setState(new DeliveredState());
    }
    public void cancel(Order order) {
        System.out.println("Đơn hàng đang xử lý đã bị hủy.");
        order.setState(new CancelledState());
    }
    public void printStatus() { System.out.println("Trạng thái: Đang xử lý."); }
}
