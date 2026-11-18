package polymorphism.customer;

public class GoldCustomer extends Customer {
    private double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        initGoldCustomer();
    }

    private void initGoldCustomer() {
        customerGrade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
