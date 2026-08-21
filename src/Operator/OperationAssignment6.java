package Operator;

public class OperationAssignment6 {
    public static void main(String[] args) {

        int kor = 85;
        int eng = 90;
        int math = 78;

        int total = kor + eng + math;
        double avg = (double) total/3;
        boolean pass = avg >= 80;

        System.out.println(total);
        System.out.printf("%.1f%n", avg);
        System.out.println(pass ? "통과":"미통과");
d
    }
}
