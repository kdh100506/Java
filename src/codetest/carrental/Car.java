package codetest.carrental;

public class Car {
    private static int serialNum = 101;

    private final int num;
    private final String carNumber;
    private final String carType;
    private final int dailyPrice;
    private boolean rented;

    public Car(String carNumber, String carType, int dailyPrice) {
        this.num = serialNum++;
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        this.rented = false;
    }

    public int rent(int days) {
        rented = true;
        return dailyPrice * days;
    }

    public void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice + "원");
        System.out.println("대여 여부: " + rented);
    }
}
