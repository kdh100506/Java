package _06C_Reference;

public class Student {
    int studentId;
    String studentName;
    Subject korean = new Subject();
    Subject math = new Subject();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }

    public void setMathSubject(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korean.getSubjectName() + " 점수는 " + korean.getScorePoint() + "점 이고, " + math.getSubjectName() + " 점수는 " + math.getScorePoint() + "점 이다");
    }
}


