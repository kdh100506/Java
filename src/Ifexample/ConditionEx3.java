package Ifexample;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 50) {
            System.out.println("버스");
        } else {
            System.out.println("기차");
        }
    }
}
