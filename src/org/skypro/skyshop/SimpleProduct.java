package org.skypro.skyshop;

public class SimpleProduct extends Product{
    private final int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;

        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше нуля");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }
}