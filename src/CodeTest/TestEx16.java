package CodeTest;

// (for문 활용)
// 5에서 15까지의 곱을 출력하세요.

public class TestEx16 {
    public static void main(String[] args) {
        long mul = 1L;

        for (int i = 5; i <= 15; i++) {
            mul *= i;
        }

        System.out.println(mul);
    }
}
