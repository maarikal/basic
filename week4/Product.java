package week4;

public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    // loodud Generate - Getter, lisasime juurde this., sest nii pidi ilusam olema
    public double getPriceAtStart() {
        return this.priceAtStart;
    }

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.priceAtStart = priceAtStart;
        this.nameAtStart = nameAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }

}
