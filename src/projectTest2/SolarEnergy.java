package projectTest2;

public class SolarEnergy extends Energy {
    public SolarEnergy(String name, double generatedKwh) {
        super(name, generatedKwh);
    }

    @Override
    public String getAdvice() {
        return "맑은 날 발전량이 많으니 패널을 깨끗하게 관리하세요.";
    }
}
