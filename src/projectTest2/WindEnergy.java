package projectTest2;

public class WindEnergy extends Energy {
    public WindEnergy(String name, double generatedKwh) {
        super(name, generatedKwh);
    }

    @Override
    public String getAdvice() {
        return "바람이 센 지역에 설치하면 발전량이 늘어납니다.";
    }
}
