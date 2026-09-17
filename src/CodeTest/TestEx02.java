package CodeTest;

// (switch case문 활용)
// 점수와 등급을 출력하세요.
// 등급은 score가 90점 이상이면 "등급: A", 80점
// 이상 90점 미만이면 "등급: B", 70점 이상 80점
// 미만이면 "등급: C", 70점 미만이면 "등급: D"를 출력하세요.

public class TestEx02 {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: " + score);

        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            default:
                grade = "D";
                break;
        }

        System.out.println("등급: " + grade);
    }
}