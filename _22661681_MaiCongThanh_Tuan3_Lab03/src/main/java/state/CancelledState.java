package state;

import constant.OrderStatus;
import model.Order;

public class CancelledState implements OrderState {
    public void next(Order order) { System.out.println("Đơn hàng đã hủy, không thể tiếp tục."); }
    public void cancel(Order order) { System.out.println("Đơn hàng đã ở trạng thái hủy."); }
    public void printStatus() { System.out.println("Trạng thái: Đã hủy."); }
}
