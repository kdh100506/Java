package test2_1304김도현_1305김지후;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyManager manager = new EnergyManager();

        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 에너지원 갯수: ");
        int count = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < count; i++) {

            System.out.print("사용 에너지원 선택 (1. 태양에너지, 2. 풍력에너지): ");
            int type = scanner.nextInt();
            System.out.println();

            System.out.print("사용할 에너지원 (예: 교내 태양광, 소형 풍력): ");
            String name = scanner.next();
            System.out.println();

            System.out.print("발전량: ");
            double generatedKwh = scanner.nextDouble();
            System.out.println();

            Energy energy;
            if (type == 1) {
                energy = new SolarEnergy(name, generatedKwh);
            } else  {
                energy = new WindEnergy(name, generatedKwh);
            }
            manager.addEnergy(energy);
        }

        System.out.println("생성된 에너지 객체 수: "+Energy.getEnergyCount());
        System.out.println();
        manager.printReport();
    }
}
