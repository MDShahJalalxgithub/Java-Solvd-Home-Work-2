public class Laptop extends Computer {
    private double weight;

    public Laptop(String brand, double price, boolean isPortable, double weight) {
        super(brand, price, isPortable);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}