package projectTest2;

import java.util.ArrayList;

public class EnergyManager {
    public static final double TARGET_KWH = 150.0;
    private final ArrayList<Energy> energies = new ArrayList<>();

    public void addEnergy(Energy energy) {
        energies.add(energy);
    }

    public void printReport() {
        if (energies.isEmpty()) {
            System.out.println("등록된 에너지원이 없습니다.");
            return;
        }

        double totalKwh = 0.0;
        double totalCo2Saved = 0.0;
        System.out.println("===== 깨끗한 에너지 발전 분석 결과 =====");
        for (Energy energy : energies) {
            double generatedKwh = energy.getGeneratedKwh();
            double co2Saved = energy.getCo2Saved();
            System.out.println("이름: " + energy.getName());
            System.out.printf("발전량: %.1fkWh%n", generatedKwh);
            System.out.printf("CO2 절감량: %.1fkg%n", co2Saved);
            System.out.println("안내: " + energy.getAdvice());

            totalKwh += generatedKwh;
            totalCo2Saved += co2Saved;
        }

        System.out.println("===== 전체 발전 분석 =====");
        System.out.printf("전체 발전량: %.1fkWh%n", totalKwh);
        System.out.printf("전체 CO2 절감량: %.1fkg%n", totalCo2Saved);
        if (totalKwh >= TARGET_KWH) {
            System.out.println("목표 발전량을 달성했습니다.");
        } else {
            System.out.println("재생에너지 확대가 필요합니다.");
        }
    }
}
