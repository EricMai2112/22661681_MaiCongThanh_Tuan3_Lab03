package states;

import model.Product;

public class PendingState implements ProductState {
    public void handleTax(Product context) {
        System.out.println("Sản phẩm đang chờ duyệt, chưa được tính thuế.");
    }
}
