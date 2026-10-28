package org.skypro.skyshop;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int percentDiscount;

    public DiscountedProduct(String name, int basePrice, int percentDiscount) {
        super(name);
        this.basePrice = (int) (basePrice * (1 - percentDiscount / 100.0));
        this.percentDiscount = percentDiscount;
    }

    @Override
    public int getPrice() {
        return (int) (basePrice * (1 - percentDiscount / 100.0));
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + getPercentDiscount() + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
