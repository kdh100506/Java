package polymorphism.customer;

public class CustomerTets2 {
    public static void main(String[] args) {
        Customer[] customers = {
                new VIPCustomer(30011, "가", 3001),
                new GoldCustomer(20011, "나"),
                new GoldCustomer(20012, "다"),
                new Customer(10011, "라"),
                new Customer(10012, "마")};

        System.out.println("=====고객정보 출력======");

        for (Customer customer : customers) {
            int cost = customer.calcPrice(10000);
            System.out.println(customer.customerName + "님이 지불해야할 금액은 " + cost + "원 입니다.");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
