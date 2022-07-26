import java.util.List;

public class PaymentType {
    private int id;
    private String type;
    private List<Payment> payments;

    public PaymentType() {
    }

    public PaymentType(int id, String type, List<Payment> payments) {
        this.id = id;
        this.type = type;
        this.payments = payments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
