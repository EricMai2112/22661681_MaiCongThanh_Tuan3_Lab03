package decorators;

import model.ProductInterface;

public class ImportFeeDecorator extends ProductDecorator {
    public ImportFeeDecorator(ProductInterface p) { super(p); }
    public double getPrice() { return decoratedProduct.getPrice() + 50.0; } // Phí nhập khẩu cố định
    public String getDescription() { return decoratedProduct.getDescription() + " + Phí nhập khẩu"; }
}
