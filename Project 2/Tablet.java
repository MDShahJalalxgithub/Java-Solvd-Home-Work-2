public class Tablet extends Computer {
    private boolean hasStylus;

    public Tablet(String brand, double price, boolean isPortable, boolean hasStylus) {
        super(brand, price, isPortable);
        this.hasStylus = hasStylus;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
}