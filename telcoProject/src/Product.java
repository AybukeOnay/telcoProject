public class Product {
    private int id;
    private Cable cable;
    private Brand brand;
    private String serialNumber;

    public Product(int id, Cable cable, Brand brand, String serialNumber) {
        this.id = id;
        this.cable = cable;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
