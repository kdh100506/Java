package CodeTest;

// (중첩된 for문 활용)
// 1부터 20까지의 숫자를 다음과 같은 형태로 출력하세요.
// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16

public class TestEx08 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
