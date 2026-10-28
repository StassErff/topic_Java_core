package org.skypro.skyshop;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 50;

    public FixPriceProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }
}
