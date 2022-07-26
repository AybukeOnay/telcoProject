public class Device extends Product{
    private String usb;

    public Device(int id, Cable cable, Brand brand, String serialNumber) {
        super(id, cable, brand, serialNumber);
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }
}
