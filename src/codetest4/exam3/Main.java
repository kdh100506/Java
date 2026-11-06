package codetest4.exam3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema c = new Cinema("어벤져스", 10);
        Customer h = new Customer("홍길동");
        Customer k = new Customer("김철수");
        int hs = sc.nextInt();
        int ks = sc.nextInt();
        c.reserve(h, hs);
        c.reserve(k, ks);

        System.out.println("==예약 결과==");
        h.showInfo();
        k.showInfo();
        c.showInfo();
    }
}
