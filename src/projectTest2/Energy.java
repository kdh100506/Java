package projectTest2;

public class Energy {
    private final String name;
    private final double generatedKwh;
    private static int energyCount;

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

    public double getCo2Saved() {
        return generatedKwh * 0.4;
    }

    public String getAdvice() {
        return "재생에너지 사용을 늘려 보세요.";
    }

    public static int getEnergyCount() {
        return energyCount;
    }
}
