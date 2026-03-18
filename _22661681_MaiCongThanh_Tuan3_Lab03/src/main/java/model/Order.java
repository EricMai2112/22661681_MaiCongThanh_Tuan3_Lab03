package model;

import constant.OrderStatus;
import state.NewOrderState;
import state.OrderState;

public class Order {
    private OrderState state = new NewOrderState();

    public void setState(OrderState state) { this.state = state; }

    public void nextStep() { state.next(this); }
    public void cancelOrder() { state.cancel(this); }
    public void showStatus() { state.printStatus(); }
}
