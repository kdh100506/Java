package polymorphism.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10011, "이순신");
        System.out.println(customerLee.showCustomerInfo());
    }
}
