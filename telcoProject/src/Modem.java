public class Modem extends Product{
    private String modemType;

    public Modem(int id, Cable cable, Brand brand, String serialNumber) {
        super(id, cable, brand, serialNumber);
    }


    public String getModemType() {
        return modemType;
    }

    public void setModemType(String modemType) {
        this.modemType = modemType;
    }
}
