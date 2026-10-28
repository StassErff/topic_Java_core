package org.skypro.skyshop;

public class SimpleProduct extends Product {
    private final int price;

    public SimpleProduct(String name, int price) {
        super(name, price);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}