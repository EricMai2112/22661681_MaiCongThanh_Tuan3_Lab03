package state;

import constant.OrderStatus;
import model.Order;

public class NewOrderState implements OrderState {
    public void next(Order order) {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển...");
        order.setState(new ProcessingState());
    }
    public void cancel(Order order) {
        System.out.println("Đơn hàng đã bị hủy và hoàn tiền.");
        order.setState(new CancelledState());
    }
    public void printStatus() { System.out.println("Trạng thái: Mới tạo (Kiểm tra thông tin)."); }
}
