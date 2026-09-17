package CodeTest;

// (자료형 활용)
// 화씨 온도(F)를 섭씨 온도(C)로 변환하는 식은 다음과 같다.
// C = (F -32) * 5/9 화씨 온도가 100도일 경우,
// 섭씨 온도를 계산하여 소수점 첫번째 자리까지 출력하세요.

public class TestEx12 {
    public static void main(String[] args) {
        double f = 100;
        double c = (f - 32) * 5 / 9;

        System.out.printf("화씨 온도 100도의 섭씨 온도는 %.1f", c);
    }
}
