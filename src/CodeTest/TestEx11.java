package CodeTest;

// (자료형 활용)
// 반지름이 12인 원의 넓이를 구하세요.
// 원주율은 상수형 변수를 선언하고 3.14 값을 저장하여 계산하세요.

public class TestEx11 {
    public static void main(String[] args) {
        int r = 12;
        final double PI = 3.14; // 상수형 변수 선언

        System.out.printf("반지름이 " + r + "인 원의 넓이는 " + (r * r * PI));
    }
}
