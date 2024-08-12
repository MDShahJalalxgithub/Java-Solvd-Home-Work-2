public class Desktop extends Computer {
    private String formFactor;

    public Desktop(String brand, double price, boolean isPortable, String formFactor) {
        super(brand, price, isPortable);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}