import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Subscription> subscriptions = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();


        Customer customer = new IndividualCustomer(1, "A123", subscriptions, addresses, "Ali", "Veli", "123456");

        Address address = new Address(1, "Türkiye", "Bursa", "Kestel", customer);


        Brand brand = new Brand();
        brand.setId(1);
        brand.setName("TTNET");

        Cable cable = new Cable();
        cable.setId(1);
        cable.setLength(10);
        cable.setType("RJ45");


        Packet packet = new Packet(1, "avantajlı", "12 ay", 150, 1, null);

        Product modem = new Modem(1, cable, brand, "A123");
        PaymentType paymentType = new PaymentType(1, "Kredi Kartı", null);
        Payment payment = new Payment(1, LocalDate.parse("2022-06-05"), null, paymentType);


        Invoice invoice = new Invoice(1, null, LocalDate.parse("2022-06-05"), LocalDate.parse("2022-06-05"), payment);
        Invoice invoice2 = new Invoice(2, null, LocalDate.parse("2022-06-05"), LocalDate.parse("2022-06-05"), payment);

        invoices.add(invoice);
        invoices.add(invoice2);
        Service adsl = new Service(1, "ADSL", null, modem);

        Subscription subscription = new Subscription(1, LocalDate.parse("2022-03-06"), adsl, packet, LocalDate.parse("2022-05-10"), invoices,address,customer);
        subscriptions.add(subscription);

        IndividualCustomer individualCustomer = new IndividualCustomer(1, "1234", subscriptions,addresses,"hakkı","haklı","12345" );

        System.out.println(subscription.getAddress().getCity());

    }
    }
}
