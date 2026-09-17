package ClassPart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + " " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";

        Student studentAhn = new Student();
        studentAhn.studentName = "안중근";

        Student studentKim = new Student();
        studentKim.studentName = "김자진";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
        System.out.println(studentAhn.getStudentName());
        System.out.println(studentKim.getStudentName());
    }
}
