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

        SearchEngine product = new SearchEngine(10);

        Article articleCookie = new Article("Cookie", "Crispy oatmeal cookies go perfectly with morning coffee");
        Article articleWaffles = new Article("Waffles", "It is customary to drizzle hot Viennese waffles with sweet maple syrup");
        Article articleToffees = new Article("Toffees", "Chewy creamy toffees stick very strongly to one's teeth");
        Article articleCake = new Article("Cake", "The delicate sponge cakes were decorated with fresh raspberries");

        product.add(cookie);
        product.add(waffles);
        product.add(marshmallow);
        product.add(toffees);
        product.add(lollipop);
        product.add(cake);
        product.add(articleCookie);
        product.add(articleWaffles);
        product.add(articleToffees);
        product.add(articleCake);

        System.out.println("===== Тест: Ищем cookie, cake, pancake =====");
        printSearchResults(product.search("cookie"));
        printSearchResults(product.search("cake"));
        printSearchResults(product.search("pancake"));

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
    public static void printSearchResults(Searchable[] results) {
        boolean foundAtLeastOne = false;
        for (Searchable item : results) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
                foundAtLeastOne = true;
            }
        }
        if (!foundAtLeastOne) {
            System.out.println("Ничего не найдено.");
        }
    }
}