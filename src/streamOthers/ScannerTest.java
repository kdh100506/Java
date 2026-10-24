package streamOthers;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("직업: ");
        String job = sc.nextLine();

        System.out.print("사번: ");
        int jobId = sc.nextInt();
        sc.nextLine();

        System.out.print("전화번호: ");
        String phone = sc.nextLine();

        System.out.println("이름: " + name + ", 직업: " + job + ", 사번: " + jobId + ", 전화번호: " + phone);
    }
}
