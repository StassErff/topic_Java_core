package org.skypro.skyshop.basket;
import org.skypro.skyshop.Product;

public class ProductBasket {
    private Product[] basket = new Product[5];

    public void addToBasket(Product product) {
        boolean isAdded = false;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                isAdded = true;
                System.out.println("Продукт добавлен в вашу корзину");
                break;
            }
        }

        if (!isAdded) {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int priseBasket() {
        int sumPriseProduct = 0;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                sumPriseProduct += basket[i].getPrice();
            }
        }
        return sumPriseProduct;
    }

    public void printContentsBasket() {
        if (priseBasket() == 0) {
            System.out.println("в корзине пусто");
        } else {
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null) {
                    System.out.println(basket[i].getName() + ": " + basket[i].getPrice());
                }
            }
        }

        System.out.println("Итого: " + priseBasket());
    }

    public boolean checkContentsBasket(String name) {
        boolean check = false;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                if (basket[i].getName().equals(name)) {
                    check = true;
                }
            }
        }
        return check;
    }

    public void emptyingTheTrash() {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                basket[i] = null;
            }
        }
        System.out.println("Корзина очищенна");
    }
}
