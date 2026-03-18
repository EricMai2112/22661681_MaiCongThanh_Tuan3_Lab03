package model;

import states.PendingState;
import states.ProductState;
import strategies.TaxStrategy;

public class Product {
    private double basePrice;
    private TaxStrategy taxStrategy;
    private ProductState state;

    public Product(double price, TaxStrategy strategy) {
        this.basePrice = price;
        this.taxStrategy = strategy;
        this.state = new PendingState(); // Mặc định là chờ duyệt
    }

    public void setState(ProductState state) { this.state = state; }
    public void applyTax() { state.handleTax(this); }
    public double getBasePrice() { return basePrice; }
    public TaxStrategy getTaxStrategy() { return taxStrategy; }
}
