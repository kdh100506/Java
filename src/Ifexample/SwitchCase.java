package Ifexample;

public class SwitchCase {
    public static void main(String[] args) {

        int ranking = 4;
        char medalColor = ' ';

        switch (ranking) {
            case 1: medalColor = 'G';
                break;
            case 2: medalColor = 'S';
                break;
            case 3: medalColor = 'B';
                break;
            default:
                System.out.println("메달이 없습니다.");
        }

        System.out.println(medalColor);

    }
}
