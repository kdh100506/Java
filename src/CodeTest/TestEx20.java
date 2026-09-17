package CodeTest;

// (중첩 for문 활용)
// 다음과 같이 for문을 사용하여 출력하세요.

public class TestEx20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
