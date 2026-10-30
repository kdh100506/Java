package codetest2.exam3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema movie = new Cinema("어벤저스", 10);
        Customer kim = new Customer("김철수");
        Customer hong = new Customer("홍길동");

        int kimSeat = sc.nextInt();
        int hongSeat = sc.nextInt();

        movie.reserve(kim, kimSeat);
        movie.reserve(hong, hongSeat);

        System.out.println("==예약 결과==");
        hong.showInfo();
        kim.showInfo();
        movie.showInfo();
    }
}
