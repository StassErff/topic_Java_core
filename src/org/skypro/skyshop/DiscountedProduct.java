package org.skypro.skyshop;

public class DiscountedProduct {
    private int basePrice;
    private int percentDiscount;

    public DiscountedProduct(int basePrise, int percentDiscount) {
        this.basePrice = basePrise;
        this.percentDiscount = percentDiscount;
    }

    public double getPrise() {
        return basePrice * (1 - percentDiscount / 100.0);
    }
}
