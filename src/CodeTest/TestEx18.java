package CodeTest;

// (if문 활용)
// 세 정수 중에서 가장 큰 수를 찾아 출력하세요.

public class TestEx18 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 99;
        int num3 = 77;

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("가장 큰 수는 " + max);
    }
}
