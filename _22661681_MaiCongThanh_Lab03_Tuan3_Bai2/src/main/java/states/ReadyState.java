package states;

import model.Product;

public class ReadyState implements ProductState {
    public void handleTax(Product context) {
        double tax = context.getTaxStrategy().calculateTax(context.getBasePrice());
        System.out.println("Thuế áp dụng: " + tax);
    }
}
