package cooperation;

public class Student {
    private String studentName;
    private int grade;
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        // this.grade = grade;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        // 버스가 승객을 태우는 함수를 적어야함.
        money -= 1100;
    }

    public void takeSubway(Subway subway) {
        // 지하철이 승객을 태우는 함수를 적어야함.
        money -= 850;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
