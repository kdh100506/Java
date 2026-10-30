package codetest2.exam4;

public class Car {
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;
    public static int serialNum = 101;

    public Car(String carNumber, String carType, int dailyPrice) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        num = serialNum;
        serialNum++;
    }

    public int rent(int day) {
        return dailyPrice * day;
    }

    public void showInfo() {
        System.out.println("관리 번호: " + num);
        System.out.println("차량 번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);
    }



}
