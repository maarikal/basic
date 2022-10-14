package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        // 1. varasem ülesanne: this.purchases.add(new Purchase(product, 1, 10));

        // ülesande 12.7 kood:
        /* 2. varasem ülesanne: Purchase purchase = new Purchase(product, 1, price);

        if(this.purchases.indexOf(purchase) == -1) {
            this.purchases.add(new Purchase(product,1, price));
        } else {
            this.purchases.get(this.purchases.indexOf(purchase)).increaseAmount(); */

        Purchase purchase = new Purchase(product, 1, price);
        if(this.purchases.containsKey(product)) {
            this.purchases.get(product).increaseAmount();
        } else {
            this.purchases.put(product, purchase);
            }
    }

    public int price() {
        int price = 0;
        for (Purchase purchase : this.purchases.values()) {
            price += purchase.price();
        }
        return price;
    }

    public void print() {
        for (Purchase purchase : this.purchases.values()) {
            System.out.println(purchase);
        }
    }
}
