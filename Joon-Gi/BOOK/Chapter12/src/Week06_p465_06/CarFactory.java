package Week06_p465_06;

import java.util.HashMap;

class CarFactory {
    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    HashMap<String, Car> carMap = new HashMap<>();

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(String name) {
        if (carMap.containsKey(name)) {
            return carMap.get(name);
        }
        Car car = new Car();
        carMap.put(name, car);
        return car;
    }
}
