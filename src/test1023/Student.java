package test1023;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void studentInfo() {
        System.out.println("학번: " + id + ", 이름: " + name);
    }
}
