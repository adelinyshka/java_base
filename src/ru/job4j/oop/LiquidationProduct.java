package ru.job4j.oop;

public final class LiquidationProduct {
    private Product product;
    private String name;
    private int price;

    public Product getProduct() {
        return this.product;
    }

    public LiquidationProduct(String name, int price) {
        product = new LiquidationProduct(name, price).getProduct();
    }

    public String label() {
        return product.label();
    }
}
