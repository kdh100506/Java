package Ifexample;

public class ConditionEx1 {
    public static void main(String[] args) {
        int price = 35000;
        int age = 17;

        price = (price>=3000) ? price-3000 : price;
        price = (age<=18) ? price-2000 : price;

        System.out.printf("최종 결제 금액 %d", price);
    }
}
