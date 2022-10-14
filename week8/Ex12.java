package week8;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("---- Exercise 12.1 ------");
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));

        System.out.println();
        System.out.println("-----Exercise 12.2-------");
        Storehouse store1 = new Storehouse();
        store1.addProduct("tea", 5, 1);
        System.out.println("stocks:");
        System.out.println("tea:  " + store1.stock("tea"));
        System.out.println("sugar: " + store1.stock("sugar"));

        System.out.println("we take a tea " + store1.take("tea"));
        System.out.println("we take a tea " + store1.take("tea"));
        System.out.println("we take sugar " + store1.take("sugar"));

        System.out.println("stocks:");
        System.out.println("tea:  " + store1.stock("tea"));
        System.out.println("sugar: " + store1.stock("sugar"));

        System.out.println();
        System.out.println("-----Exercise 12.3----");
        Storehouse store2 = new Storehouse();
        store2.addProduct("milk", 3, 10);
        store2.addProduct("coffee", 5, 6);
        store2.addProduct("buttermilk", 2, 20);
        store2.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store2.products()) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("---------Exercise 12.4--------");
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println("(price) " + purchase);
        purchase.increaseAmount();
        System.out.println("(price after increasement) " + purchase);
        purchase.increaseAmount();
        System.out.println("(price after increasement) " + purchase);

        System.out.println();
        System.out.println("----Exercise 12.5------");
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());

        System.out.println();
        System.out.println("----Exercise 12.6------");
        basket.print();


        System.out.println();
        System.out.println("----Exercise 12.7------");
        ShoppingBasket basket1 = new ShoppingBasket();
        basket1.add("milk", 3);
        basket1.print();
        System.out.println("basket price: " + basket1.price() +"\n");

        basket1.add("buttermilk", 2);
        basket1.print();
        System.out.println("basket price: " + basket1.price() +"\n");

        basket1.add("milk", 3);
        basket1.print();
        System.out.println("basket price: " + basket1.price() +"\n");

        basket1.add("milk", 3);
        basket1.print();
        System.out.println("basket price: " + basket1.price() +"\n");


        System.out.println("----Exercise 12.8------");
        Storehouse store3 = new Storehouse();
        store3.addProduct("coffee", 5, 10);
        store3.addProduct("milk", 3, 20);
        store3.addProduct("milkbutter", 2, 55);
        store3.addProduct("bread", 7, 8);

        Shop shop = new Shop(store3, new Scanner(System.in));
        shop.manage("Pekka");
    }
}