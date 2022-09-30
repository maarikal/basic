package week10;

import java.text.DecimalFormat;
import java.util.List;

public class Hamburger {
    public String name;
    public String meat;
    public double price;
    public String breadRollType;

    private List<Hamburger> additions;

    public String addition1Name;
    public double addition1Price;
    public String addition2Name;
    public double addition2Price;
    public String addition3Name;
    public double addition3Price;
    public String addition4Name;
    public double addition4Price;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }


    public String itemizeHamburger() {
        double totalPrice = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        String text = df.format(totalPrice);
        return text;
    }



    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}


