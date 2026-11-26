package test2_1304김도현_1305김지후;

public class Energy {
    private String name;
    private double generatedKwh;
    private static int energyCount = 0;

    public Energy(String name, double generatedKwh) {
        this.name = name;
        this.generatedKwh = generatedKwh;
        energyCount++;
    }

    public String getName() {
        return name;
    }

    public double getGeneratedKwh() {
        return generatedKwh;
    }

    public static int getEnergyCount() {
        return energyCount;
    }

    public double getCo2Saved() {
        return generatedKwh * 0.4;
    }

    public String getAdvice() {
        return "재생에너지 사용량을 늘리세요";
    }
}
