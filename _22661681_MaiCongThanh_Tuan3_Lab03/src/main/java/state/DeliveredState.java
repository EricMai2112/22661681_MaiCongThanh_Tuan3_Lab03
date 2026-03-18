package state;

import constant.OrderStatus;
import model.Order;

public class DeliveredState implements OrderState {
    public void next(Order order) { System.out.println("Đơn hàng đã hoàn tất, không thể chuyển tiếp."); }
    public void cancel(Order order) { System.out.println("Không thể hủy đơn hàng đã giao."); }
    public void printStatus() { System.out.println("Trạng thái: Đã giao."); }
}
