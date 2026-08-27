package Ifexample;

public class ConditionEx4 {
    public static void main(String[] args) {
        int dollar = 50;
        int exchangeRate = 1400;

        if (dollar < 0) {
            System.out.println("잘못된 금액 입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + (exchangeRate*dollar) + "입니다.");
        }
    }
}
