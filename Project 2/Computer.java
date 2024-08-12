public class Computer {
    private String brand;
    private double price;
    private boolean isPortable;
    public Computer(String brand, double price, boolean isPortable) {
        this.brand = brand;
        this.price = price;
        this.isPortable = isPortable;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean isPortable) {
        this.isPortable = isPortable;
    }
}