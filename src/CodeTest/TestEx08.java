package CodeTest;

// (중첩된 for문 활용)
// 1부터 20까지의 숫자를 다음과 같은 형태로 출력하세요.
// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16

public class TestEx08 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                // 1, 3번째 줄 (인덱스 0, 2): 왼쪽 -> 오른쪽 증가
                for (int j = 1; j <= 5; j++) {
                    System.out.print((i * 5 + j) + " ");
                }
            } else {
                // 2, 4번째 줄 (인덱스 1, 3): 오른쪽 -> 왼쪽 감소
                for (int j = 5; j >= 1; j--) {
                    System.out.print((i * 5 + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
