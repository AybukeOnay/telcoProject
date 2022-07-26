public class Address {
    private int id;
    private String country;
    private String city;
    private String district;
    private Customer customer;

    public Address() {
    }

    public Address(int id, String country, String city, String district, Customer customer) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.district = district;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
