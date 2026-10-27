package org.skypro.skyshop.basket;
import org.skypro.skyshop.Product;

public class ProductBasket {
    private Product[] basket = new Product[5];

    public void addToBasket(Product product) {
        //boolean add = false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                //add = true;
                break;
            } else {
                System.out.println("Невозможно добавить продукт");
            }
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
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i].getName() + ": " + basket[i].getPrice());
            }
        }
        System.out.println("Итого: " + priseBasket());
    }
}
