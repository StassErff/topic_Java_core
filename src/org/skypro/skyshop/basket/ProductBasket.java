package org.skypro.skyshop.basket;
import org.skypro.skyshop.Product;

public class ProductBasket {
    private Product[] basket = new Product[5];

    public void addToCart(Product product) {
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
}
