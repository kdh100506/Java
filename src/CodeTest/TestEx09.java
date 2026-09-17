package CodeTest;

// (배열, arraycopy(), for문 활용)
// first 배열의 두 번째 요소부터 세 개의 값과
// second 배열의 세 번째 요소부터 두 개의 값을 순서대로
// result 배열에 복사하고, 완성된 result 배열의 값을 출력하세요.

public class TestEx09 {
    public static void main(String[] args) {
        int[] first = {10, 20, 30, 40, 50};
        int[] second = {60, 70, 80, 90, 100};
        int[] result = new int[5];

        System.arraycopy(first, 1, result, 0, 3);
        System.arraycopy(second, 2, result, 3, 2);

        System.out.print("완성된 배열: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
