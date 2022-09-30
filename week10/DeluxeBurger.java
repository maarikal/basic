package week10;

import java.text.DecimalFormat;

public class DeluxeBurger extends Hamburger{

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);
    }

    public String itemizeHamburger() {
        double totalPrice = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        String text = df.format(totalPrice);
        return text; }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
