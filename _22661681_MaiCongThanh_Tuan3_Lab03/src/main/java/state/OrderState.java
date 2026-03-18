package state;

import model.Order;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    void printStatus();
}
