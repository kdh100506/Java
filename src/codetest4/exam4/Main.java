package codetest4.exam4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("234하5678", "tealar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        int cc = sc.nextInt();
        int d = sc.nextInt();

        if(cc > 0 && cc <= cars.size()) {
            totalPrice = cars.get(cc - 1).rent(d);
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        for(Car car : cars) {
            car.showInfo();
            System.out.println();
        }

        System.out.println("총 대여금액: " + totalPrice);
    }
}
