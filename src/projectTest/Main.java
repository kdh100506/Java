package projectTest;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            WasteManager manager = new WasteManager();

            int count = sc.nextInt();

            for (int i = 0; i < count; i++) {
                int type = sc.nextInt();
                String name = sc.next();
                double servedGrams = sc.nextDouble();
                double wasteGrams = sc.nextDouble();

                if (type == 1) {
                    Food rice = new RiceFood(name, servedGrams, wasteGrams);
                    manager.addFood(rice);
                } else if (type == 2) {
                    Food side = new SideDish(name, servedGrams, wasteGrams);
                    manager.addFood(side);
                }
            }

            int totalCount = Food.getFoodCount();
            System.out.println("생성된 음식 객체 수: " + totalCount + "\n");

            manager.printReport();
        }
    }
