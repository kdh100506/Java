package CodeTest;

// (배열, for문, if문 활용)
// for문을 활용하여 배열의 인덱스가 짝수이면 (인덱스 + 1) * 2를,
// 인덱스가 홀수이면 (인덱스 +2) * 3을 차례대로 저장한 후
// 배열의 모든 값을 순서대로 출력하세요.

public class TestEx05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.print("numbers 배열에 저장된 값: ");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                numbers[i] = (i + 1) * 2;
            } else {
                numbers[i] = (i + 2) * 3;
            }

            System.out.print(numbers[i] + " ");
        }
    }
}
