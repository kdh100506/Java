package codetest4.exam4;

public class Car {
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;
    public static int serialNum = 101;

    public Car(String cn, String ct, int dp) {
        carNumber = cn;
        carType = ct;
        dailyPrice = dp;
        num = serialNum++;
    }

    public int rent(int d) {
        rented = true;
        return dailyPrice * d;
    }

    public void showInfo() {
        System.out.println("관리번호: " + num + "\n차량번호: " + carNumber + "\n차종: " + carType + "\n1일 대여 요금: " + dailyPrice + "\n대여 상태: " + rented);
    }
}
