package test17;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int number = 10000;

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        number++;
        return new Car(number);
    }
}
