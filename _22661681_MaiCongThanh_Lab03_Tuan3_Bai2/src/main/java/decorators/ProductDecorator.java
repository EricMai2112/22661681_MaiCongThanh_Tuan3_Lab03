package decorators;

import model.ProductInterface;

public abstract class ProductDecorator implements ProductInterface {
    protected ProductInterface decoratedProduct;
    public ProductDecorator(ProductInterface p) { this.decoratedProduct = p; }
}
