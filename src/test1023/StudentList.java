package test1023;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영헌", "안세영", "우상혁", "최인호"};
        int i = 1101;

        ArrayList<Student> studentList = new ArrayList<Student>();

        for(String nameInstance : name) {
            studentList.add(new Student(nameInstance, i));
            i++;
        }

        for(Student student : studentList) {
            student.studentInfo();
        }
    }
}
