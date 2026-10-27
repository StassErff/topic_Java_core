package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        SimpleProduct cookie = new SimpleProduct("печенье", 60);
        SimpleProduct waffles = new SimpleProduct("вафли", 70);
        SimpleProduct marshmallow = new SimpleProduct("зефир", 105);
        SimpleProduct toffees = new SimpleProduct("ириски", 50);
        SimpleProduct lollipop = new SimpleProduct("леденец", 15);
        SimpleProduct cake = new SimpleProduct("пироженое", 30);

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