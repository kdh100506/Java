package codetest2.exam4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        Car car1 = new Car("234하5678", "teslar", 100000);
        Car car2 = new Car("555허2158", "sonata", 70000);
        Car car3 = new Car("123호4567", "genesis", 90000);

        System.out.println("대여차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요. \n");
        car1.showInfo();
        System.out.println();
        car2.showInfo();
        System.out.println();
        car3.showInfo();
        System.out.println();

        int carType = sc.nextInt();
        int day = sc.nextInt();

        if(carType == 1) {
            totalPrice = car1.rent(day);
        } else if(carType == 2) {
            totalPrice = car2.rent(day);
        } else if (carType == 3) {
            totalPrice = car3.rent(day);
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        System.out.println("총 대여금액: " + totalPrice);
    }
}
