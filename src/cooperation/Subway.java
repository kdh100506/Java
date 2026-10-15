package cooperation;

public class Subway {
    private int lineNumber;
    private int money;
    private int passengerCount;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
        // this.money = money;
        // this.passengerCount = passengerCount;
    }

    public void takePerson() {
        money += 850;
        passengerCount ++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "선의 지하철 승객은 " + passengerCount + "명 이고 수입은 " + money + "원 입니다.");
    }
}
