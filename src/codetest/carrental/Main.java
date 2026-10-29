package codetest.carrental;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int selectedCar = scanner.nextInt();
        int days = scanner.nextInt();
        int totalPrice = 0;

        if (selectedCar < 1 || selectedCar > cars.size()) {
            System.out.println("잘못된 입력입니다");
        } else {
            totalPrice = cars.get(selectedCar - 1).rent(days);
        }

        for (Car car : cars) {
            car.showInfo();
        }
        System.out.println("총 대여금액: " + totalPrice + "원");
        scanner.close();
    }
}
