package projectTest;

import java.util.ArrayList;
import java.util.Locale;

public class WasteManager {
    private ArrayList<Food> foods = new ArrayList<>();
    public static final double TARGET_RATE = 20.0;

    public void addFood(Food food) {
        foods.add(food);
    }

    public void printReport() {
        if (foods.isEmpty()) {
            System.out.println("등록된 음식이 없습니다.");
            return;
        }

        double totalServedGrams = 0;
        double totalWasteGrams = 0;
        System.out.println("===== 학교 급식 잔반 분석 결과 =====");
        for (Food food : foods) {
            System.out.println("음식명: " + food.getName());
            System.out.printf(Locale.ROOT, "배식량: %.1fg%n", food.getServedGrams());
            System.out.printf(Locale.ROOT, "잔반량: %.1fg%n", food.getWasteGrams());
            System.out.printf(Locale.ROOT, "잔반율: %.1f%%%n", food.getWasteRate());
            System.out.println("개선 안내: " + food.getAdvice());
            totalServedGrams += food.getServedGrams();
            totalWasteGrams += food.getWasteGrams();
        }

        double totalWasteRate = totalWasteGrams / totalServedGrams * 100;
        System.out.println("===== 전체 잔반 분석 =====");
        System.out.printf(Locale.ROOT, "전체 배식량: %.1fg%n", totalServedGrams);
        System.out.printf(Locale.ROOT, "전체 잔반량: %.1fg%n", totalWasteGrams);
        System.out.printf(Locale.ROOT, "전체 잔반율: %.1f%%%n", totalWasteRate);
        if (totalWasteRate <= TARGET_RATE) {
            System.out.println("목표 잔반율을 달성했습니다.");
        } else {
            System.out.println("잔반을 줄이기 위한 개선이 필요합니다.");
        }
    }
}
