package Ifexample;

public class SwitchCase2 {
    public static void main(String[] args) {
        String medel = "Gold";

        switch (medel) {
            case "Gold" :
                System.out.println("금메달 입니다.");
                break;
            case "Seliver" :
                System.out.println("은메달 입니다.");
                break;
            case "Bronze" :
                System.out.println("동메달 입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
        }

        String message = switch (medel) {
            case "Gold" -> "금메달 입니다.";
            case "Seliver" -> "은메달 입니다.";
            case "Bronze" -> "동메달 입니다.";
            default -> "메달이 없습니다.";
        };
        System.out.printf(message);
    }
}
