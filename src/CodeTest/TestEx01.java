package CodeTest;

// (if문, 비교연산자, 논리연산자 활용)
// 나이, 점수, 결과를 차례로 출력하세요.
// 결과는 age가 16 이상이고 score가 80 이상이면
// "통과", 그렇지 않으면 "미통과"를 출력하세요.

public class TestEx01 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;

        if(age >= 16 && score >= 80) {
            System.out.println("통과");
        } else {
            System.out.println("미통과");
        }
    }
}
