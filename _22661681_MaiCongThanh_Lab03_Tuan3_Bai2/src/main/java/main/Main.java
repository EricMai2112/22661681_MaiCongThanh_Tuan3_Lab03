package main;

import decorators.BasicProduct;
import decorators.ImportFeeDecorator;
import model.Product;
import model.ProductInterface;
import states.ReadyState;
import strategies.LuxuryTax;

public class Main {
    public static void main(String[] args) {
        // 1. Dùng Decorator để thêm phí nhập khẩu vào sản phẩm gốc
        ProductInterface myItem = new BasicProduct(1000.0);
        myItem = new ImportFeeDecorator(myItem);
        System.out.println(myItem.getDescription() + " | Tổng giá: " + myItem.getPrice());

        // 2. Dùng Strategy và State để quản lý thuế
        Product product = new Product(myItem.getPrice(), new LuxuryTax());

        product.applyTax(); // Trạng thái Pending: Không tính thuế

        product.setState(new ReadyState());
        product.applyTax(); // Trạng thái Ready: Tính thuế 20% trên 1050.0
    }
}
