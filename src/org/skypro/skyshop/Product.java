package org.skypro.skyshop;

import java.util.Objects;

public abstract class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Product product = (Product) a;
        return Objects.equals(name, product.name);
    }

    public abstract boolean isSpecial();
}
