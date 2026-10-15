package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentKim = new Student("김도현", 60000);
        Bus busA = new Bus(937);

        studentKim.takeBus(busA);
        studentKim.showInfo();

        Student studentLee = new Student("이하랑", 10000);
        Subway subway2 = new Subway(2);

        studentLee.takeSubway(subway2);
        studentLee.showInfo();

        studentKim.takeSubway(subway2);
        studentKim.showInfo();
    }
}
