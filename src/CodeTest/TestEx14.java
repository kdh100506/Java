package CodeTest;

// (for문과 if문의 활용)
// 1에서 100까지 정수 중에서 3의 배수인 수만 더한 결과를 출력하세요.

public class TestEx14 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
