package week10;

import java.text.DecimalFormat;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    private static final DecimalFormat df = new DecimalFormat("0.00");


    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "Black");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        System.out.println("Added Healthy addition " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        System.out.println("Added Healthy addition " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
    }

    @Override
    public String itemizeHamburger() {
        double totalPrice = super.price + super.addition1Price + super.addition2Price + super.addition3Price + super.addition4Price + this.healthyExtra1Price + this.healthyExtra2Price;
        String text = df.format(totalPrice) ;
        return text ;
    }
}
