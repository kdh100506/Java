package projectTest2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyManager manager = new EnergyManager();

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT)) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                int type = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                double generatedKwh = scanner.nextDouble();

                Energy energy;
                if (type == 1) {
                    energy = new SolarEnergy(name, generatedKwh);
                } else {
                    energy = new WindEnergy(name, generatedKwh);
                }
                manager.addEnergy(energy);
            }

            System.out.println("생성된 에너지 객체 수: " + Energy.getEnergyCount());
            manager.printReport();
        }
    }
}
