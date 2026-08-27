package Ifexample;

public class SwitchCase3 {
    public static void main(String[] args) {

        int month = 10;

        int day = switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 0;
        };

        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
