import java.time.LocalDate;

public class Payment {
    private int id;
    private LocalDate paymentDate;
    private Invoice invoice;
    private PaymentType paymentType;

    public Payment() {
    }

    public Payment(int id, LocalDate paymentDate, Invoice invoice, PaymentType paymentType) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.invoice = invoice;
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
