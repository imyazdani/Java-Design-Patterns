package org.example.creational.factory_method;

/*
    Factory method is a creational design pattern which solves the problem of creating product objects
    without specifying their concrete classes.
 */
public class Main {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct(ProductEnum.PRODUCT_A);
        product.display();

        product = ProductFactory.getProduct(ProductEnum.PRODUCT_A);
        product.display();
    }
}
