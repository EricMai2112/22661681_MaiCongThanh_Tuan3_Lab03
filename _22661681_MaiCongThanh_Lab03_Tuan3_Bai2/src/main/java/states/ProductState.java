package states;

import model.Product;

public interface ProductState {
    void handleTax(Product context);
}