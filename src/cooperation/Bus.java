package cooperation;

public class Bus {
    private int busNumber;
    private int money;
    private int passengerCount;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        // this.money = money;
        // this.passengerCount = passengerCount;
    }

    public void takePerson() {
        money += 1100;
        passengerCount ++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고 수입은 " + money + "원 입니다.");
    }
}
