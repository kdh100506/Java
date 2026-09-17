package CodeTest;

// (배열, for문 활용)
// 90점 이상을 받은 학생이 몇 명인지 출력하세요.

public class TestEx21 {
    public static void main(String[] args) {
        int[] score = {78, 95, 64, 88, 100, 73, 82, 59, 91, 67};
        int a = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                a++;
            }
        }

        System.out.println("점수가 90점 이상인 학생은 " + a + "명입니다.");
    }
}
