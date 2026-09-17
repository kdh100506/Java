package CodeTest;

// (배열, for문 활용)
// for문과 배열의 인덱스를 이용하여
// 첫 번째, 세번째, 다섯 번째, 일곱 번째 요소,
// 즉 홀수 번째에 위치한 요소들과 그 합을 출력하세요.

public class TestEx06 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 18, 57, 24, 39, 16, 8};
        int sum = 0;

        System.out.print("홀수 번째 요소: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.print("\n홀수 번째 요소의 합: " + sum);
    }
}
