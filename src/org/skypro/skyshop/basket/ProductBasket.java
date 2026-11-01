package org.skypro.skyshop.basket;
import org.skypro.skyshop.Product;
import org.skypro.skyshop.DiscountedProduct;
import org.skypro.skyshop.FixPriceProduct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private final List<Product> basket = new ArrayList<>();

    public void addToBasket(Product product) {
        basket.add(product);
        System.out.println("Продукт добавлен в вашу корзину");
    }

    public int priceBasket() {
        int sumPriseProduct = 0;

        for (Product product : basket) {
            sumPriseProduct += product.getPrice();
        }
        return sumPriseProduct;
    }

    public void printContentsBasket() {
        if (priceBasket() == 0) {
            System.out.println("в корзине пусто");
        } else {
            for (Product product : basket) {
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
        boolean check = false;

        for (Product product : basket) {
            if (product.getName().equals(name)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void emptyingTheTrash() {
        basket.clear();
        System.out.println("Корзина очищенна");
    }

    public List delProductByName(String name) {
        List<Product> delProduct = new ArrayList<>();
        Iterator<Product> iterator = basket.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();

            if (product.getName() != null && product.getName().equals(name)) {
                delProduct.add(product);
                iterator.remove();
            }
        }
        return delProduct;
    }
}
