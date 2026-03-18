package constant;

import model.Order;

public interface OrderStatus {
    void next(Order order);
    void cancel(Order order);
    void printStatus();
}
