package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.customerID = 10010;
        customerLee.customerName = "이정연";
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerMoon = new VIPCustomer();
        customerMoon.customerName = "문성준";
        customerMoon.customerID = 20010;
        customerMoon.bonusPoint = 10000;

        System.out.println(customerMoon.showCustomerInfo());
    }
}
