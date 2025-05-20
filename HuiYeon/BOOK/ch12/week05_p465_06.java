package ch12;
import java.util.HashMap;

class Car {
    String name;

    public Car() {}
    public Car(String name ) {
        this.name = name;
    }
}

class CarFactory {

    private static CarFactory instance = new CarFactory();
    HashMap<String, Car> carMap = new HashMap<>();

    //싱글톤 패턴 -> 공장은 한 개만 있어야 차 목록이 공유가 된다
    private CarFactory() {}
    public static CarFactory getInstance() {
        if (instance == null)
            instance = new CarFactory();
        return instance;
    }

    public Car createCar(String name) {
        if( carMap.containsKey(name) ) {
            return carMap.get(name);
        }
        Car car = new Car();
        carMap.put(name, car);
        return car;
    }

}

public class week05_p465_06 {
    public static void main(String[ ] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        System.out.println(sonata1 == sonata2);			// true
        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1 == avante2);			// true
        System.out.println(sonata1 == avante1);			// false
    }
}
