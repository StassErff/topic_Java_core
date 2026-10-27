package org.skypro.skyshop;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Product product = (Product) a;
        return Objects.equals(name, product.name);
    }
}
