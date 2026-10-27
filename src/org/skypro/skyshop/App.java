package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product cookie = new Product("печенье", 60);
        Product waffles = new Product("вафли", 70);
        Product marshmallow = new Product("зефир", 105);
        Product toffees = new Product("ириски", 50);
        Product lollipop = new Product("леденец", 15);
        Product cake = new Product("пироженое", 30);

        ProductBasket basket = new ProductBasket();

        basket.addToBasket(cookie);
        basket.addToBasket(waffles);
        basket.addToBasket(marshmallow);
        basket.addToBasket(toffees);
        basket.addToBasket(lollipop);

        basket.addToBasket(cake);

        basket.printContentsBasket();

        System.out.println("Стоимость вашей корзины: " + basket.priseBasket());

        System.out.println(basket.checkContentsBasket("леденец"));

        System.out.println(basket.checkContentsBasket("пироженое"));

        basket.emptyingTheTrash();

        basket.printContentsBasket();

        System.out.println("Стоимость вашей корзины: " + basket.priseBasket());

        System.out.println(basket.checkContentsBasket("леденец"));
    }
}