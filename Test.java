package src.ecommerce;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {

        Product s10 = new Product(UUID.randomUUID(), "samsung-S10", "black", "mobile-phone", 35, 0.2,
                "Üst sınıf cep telefonu");
        Product car = new Product(UUID.randomUUID(), "megane", "white", "car", 14, 1200.0, "French car");
        Product monitor = new Product(UUID.randomUUID(), "viewsonic", "white", "monitor", 120, 5.2, "Player monitor");

        User berkay = new User(UUID.randomUUID(), "berkay", "Berkay", "Yerel", LocalDate.of(2000, Month.MARCH, 5), "123",
                "sample@gmail.com", "Manisa", "Manisa YSE");
        User toprak = new User(UUID.randomUUID(), "toprak", "Toprak", "Hüriyet", LocalDate.of(2002, Month.JANUARY, 13),
                "12345", "sample1@gmail.com", "izmir", "İzmir Karşıyaka");
        User meral = new User(UUID.randomUUID(), "meral", "Meral", "Kayık", LocalDate.of(1999, Month.FEBRUARY, 21),
                "123456", "sample2@gmail.com", "Kadıköy", "İstanbul Kadıköy");

        CreditCard berkay1 = new CreditCard(UUID.randomUUID(), berkay, "23748628", "456",
                LocalDate.of(2027, Month.JANUARY, 25));
        CreditCard berkay2 = new CreditCard(UUID.randomUUID(), berkay, "23784562", "557",
                LocalDate.of(2028, Month.JANUARY, 25));
        CreditCard toprak1 = new CreditCard(UUID.randomUUID(), toprak, "23498756", "757",
                LocalDate.of(2025, Month.JANUARY, 25));
        CreditCard meral1 = new CreditCard(UUID.randomUUID(), meral, "08329080", "757",
                LocalDate.of(2024, Month.JANUARY, 25));

        berkay.orderProduct(s10, berkay2, 5);
        berkay.orderProduct(monitor, berkay1, 3);
        meral.orderProduct(car, meral1, 1);
        toprak.orderProduct(s10, toprak1, 2);

        toprak.addFavorites(monitor);
        toprak.addFavorites(car);

        berkay.getOrders().get(0).purchaseOrder();
        for (Product p : toprak.getFavoriteProducts()) {
            System.out.println(p.getName());
        }

        for (Product p : toprak.getOrderedProducts()) {
            System.out.println(p.getName());
        }
        for (Order o : berkay.getOrders()) {
            if (o.isPurchased()) {
                System.out.println(o.getProductCount() + " adet " + o.getProduct().getName() + " " + "is purchased.");
            } else
                System.out.println(o.getProductCount() + " adet " + o.getProduct().getName() + " not purchased.");
        }
    }
}
