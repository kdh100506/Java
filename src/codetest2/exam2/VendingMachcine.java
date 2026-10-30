package codetest2.exam2;

public class VendingMachcine {
    private String name;
    private int price;
    private int stock;

    public VendingMachcine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int minusStock) {
        if(stock >= minusStock) {
            stock -= minusStock;
        } else {
            System.out.println("음료를 판매할수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price);
        System.out.println("제고 수량: " + stock);
    }
}
