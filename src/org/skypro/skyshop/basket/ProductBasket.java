package org.skypro.skyshop.basket;
import org.skypro.skyshop.Product;
import org.skypro.skyshop.DiscountedProduct;
import org.skypro.skyshop.FixPriceProduct;

import java.util.*;

public class ProductBasket {
    private final Map<String, Product> basket = new HashMap<>();

    public void addToBasket(String name, Product product) {
        basket.put(name, product);
        System.out.println("Продукт добавлен в вашу корзину");
    }

    public int priceBasket() {
        int sumPriseProduct = 0;

        for (Product product : basket.values()) {
            sumPriseProduct += product.getPrice();
        }
        return sumPriseProduct;
    }

    public void printContentsBasket() {
        if (basket.isEmpty()) {
            System.out.println("в корзине пусто");
        } else {
            for (Product product : basket.values()) {
                if (product instanceof DiscountedProduct discounted) {
                    System.out.println(discounted.getName() + ": " + discounted.getPrice() + " (" + discounted.getPercentDiscount() + "%)");
                } else if (product instanceof FixPriceProduct) {
                    System.out.println(product.getName() + ": Фиксированная цена " + product.getPrice());
                } else {
                    System.out.println(product.getName() + ": " + product.getPrice());
                }
            }
        }

        System.out.println("Итого: " + priceBasket());
    }

    public boolean checkContentsBasket(String name) {
        return basket.containsKey(name);
    }

    public void emptyingTheTrash() {
        basket.clear();
        System.out.println("Корзина очищенна");
    }

    public List delProductByName(String name) {
        List<Product> delProduct = new LinkedList<>();
        Product removedProduct = basket.remove(name);

        if (removedProduct != null) {
            delProduct.add(removedProduct);
        }

        return delProduct;
    }
}
