package polymorphism.customer;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        initVIPCustomer();
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        initVIPCustomer();
        this.agentID = agentID;
        System.out.println("하위 클래스 VIPCustomer(int, String) 생성자 호출");
    }

    private void initVIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getagentID() {
        return agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String showCustomerInfo() {
        return showCustomerInfo() + "\n상담원 ID는 " + getagentID() + "입니다.";
    }
}
