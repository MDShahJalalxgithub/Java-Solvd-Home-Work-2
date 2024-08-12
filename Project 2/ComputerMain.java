public class ComputerMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 999.99, true, 2.5);
        Desktop desktop = new Desktop("HP", 799.99, false, "Tower");
        Server server = new Server("IBM", 5000.00, false, 4);
        Tablet tablet = new Tablet("Apple", 599.99, true, true);

        // Accessing properties using getters
        System.out.println("Laptop: " + laptop.getBrand() + ", Price: $" + laptop.getPrice() + ", Weight: " + laptop.getWeight() + " kg");
        System.out.println("Desktop: " + desktop.getBrand() + ", Price: $" + desktop.getPrice() + ", Form Factor: " + desktop.getFormFactor());
        System.out.println("Server: " + server.getBrand() + ", Price: $" + server.getPrice() + ", Rack Units: " + server.getRackUnits());
        System.out.println("Tablet: " + tablet.getBrand() + ", Price: $" + tablet.getPrice() + ", Has Stylus: " + tablet.isHasStylus());
    }
}