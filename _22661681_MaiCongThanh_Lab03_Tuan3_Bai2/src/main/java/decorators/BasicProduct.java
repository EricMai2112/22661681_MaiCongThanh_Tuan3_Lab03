package decorators;

import model.ProductInterface;

public class BasicProduct implements ProductInterface {
    private double price;
    public BasicProduct(double price) { this.price = price; }
    public double getPrice() { return price; }
    public String getDescription() { return "Sản phẩm cơ bản"; }
}
