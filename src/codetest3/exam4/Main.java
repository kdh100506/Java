package codetest3.exam4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요. \n");
        int carType = sc.nextInt();
        int day = sc.nextInt();

        if (carType >= 1 && carType <= cars.size()) {
            totalPrice = cars.get(carType - 1).rent(day);
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        for (Car car : cars) {
            car.showInfo();
            System.out.println();
        }

        System.out.println("총 대여금액: " + totalPrice);
    }
}
