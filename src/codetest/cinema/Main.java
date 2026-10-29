package codetest.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema("어벤져스", 10);
        Customer firstCustomer = new Customer("홍길동");
        Customer secondCustomer = new Customer("김철수");

        int firstCount = scanner.nextInt();
        int secondCount = scanner.nextInt();

        cinema.reserve(firstCustomer, firstCount);
        cinema.reserve(secondCustomer, secondCount);

        System.out.println("==예약 결과==");
        firstCustomer.showInfo();
        secondCustomer.showInfo();
        cinema.showInfo();
        scanner.close();
    }
}
