package org.example.creational.factory_method;

public class ProductFactory {
    public static Product getProduct(ProductEnum productType) {
        return switch (productType) {
            case PRODUCT_A -> new ProductA();
            case PRODUCT_B -> new ProductB();
        };
    }
}
