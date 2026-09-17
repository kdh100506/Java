package CodeTest;

// (배열, for문, if문 활용)
// 배열에 저장된 값 중에서 짝수만 찾아 가장 큰 값을 출력하세요.

public class TestEx07 {
    public static void main(String[] args) {
        int[] numbers = {13, 66, 34, 83, 41, 92, 23, 76};
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i] && numbers[i] % 2 == 0) {
                max = numbers[i];
            }
        }

        System.out.println("짝수 중 가장 큰 값: " + max);
    }
}
