package codetest4.exam2;

public class VendingMachine {
    private String name;
    private int price;
    private int stock;

    public VendingMachine(String n, int p, int s) {
        name = n;
        price = p;
        stock = s;
    }

    public void sell(int s) {
        if(s > 0 && s <= stock) {
            stock -= s;
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("음료 이름: " + name + "\n가격: " + price + "원\n남은 재고: " + stock + "개");
    }
}
