public class Server extends Computer {
    private int rackUnits;

    public Server(String brand, double price, boolean isPortable, int rackUnits) {
        super(brand, price, isPortable);
        this.rackUnits = rackUnits;
    }

    public int getRackUnits() {
        return rackUnits;
    }

    public void setRackUnits(int rackUnits) {
        this.rackUnits = rackUnits;
    }
}