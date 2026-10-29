package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        SimpleProduct cookie = new SimpleProduct("печенье", 60);
        SimpleProduct waffles = new SimpleProduct("вафли", 70);
        DiscountedProduct marshmallow = new DiscountedProduct("зефир", 105, 15);
        DiscountedProduct toffees = new DiscountedProduct("ириски", 50, 40);
        SimpleProduct lollipop = new SimpleProduct("леденец", 15);
        FixPriceProduct cake = new FixPriceProduct("пироженое");

        ProductBasket basket = new ProductBasket();

        basket.addToBasket(cookie);
        basket.addToBasket(waffles);
        basket.addToBasket(marshmallow);
        basket.addToBasket(toffees);
        basket.addToBasket(cake);

        basket.printContentsBasket();

        System.out.println("Стоимость вашей корзины: " + basket.priceBasket());

        System.out.println(basket.checkContentsBasket("леденец"));

        System.out.println(basket.checkContentsBasket("пироженое"));

        basket.emptyingTheTrash();

        basket.printContentsBasket();

        System.out.println("Стоимость вашей корзины: " + basket.priceBasket());

        System.out.println(basket.checkContentsBasket("леденец"));
    }
}