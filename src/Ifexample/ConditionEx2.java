package Ifexample;

public class ConditionEx2 {
    public static void main(String[] args) {
        int temp = 23;

        if (temp >= 30) {
            System.out.println("더운 날씨 입니다.");
        } else if (temp >= 20) {
            System.out.println("따뜻한 날씨 입니다.");
        } else if (temp >= 10) {
            System.out.println("시원한 날씨 입니다.");
        } else {
            System.out.println("추운 날씨 입니다.");
        }
    }
}
