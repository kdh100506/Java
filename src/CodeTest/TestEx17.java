package CodeTest;

// (배열, for문 활용)
// 다음은 A반 학생들의 성적이다. 과목별 평균을 구하여 출력하세요.

public class TestEx17 {
    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 100},
                {74, 100, 88},
                {65, 77, 90},
                {45, 76, 82},
                {98, 100, 92}
        };

        String[] subName = {"국어", "영어", "수학"};

        for (int i = 0; i < subName.length; i++) {
            int sum = 0;

            for (int j = 0; j < score.length; j++) {
                sum += score[j][i];
            }

            double avg = (double) sum / score.length;
            System.out.println(subName[i] + ": " + avg);
        }
    }
}
