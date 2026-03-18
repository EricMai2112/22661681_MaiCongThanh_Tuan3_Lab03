import model.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.showStatus(); // Mới tạo
        order.nextStep();   // Chuyển sang Đang xử lý

        order.showStatus();
        order.nextStep();   // Chuyển sang Đã giao

        order.showStatus();
        order.cancelOrder(); // Thử hủy đơn đã giao -> Không thể
    }
}
