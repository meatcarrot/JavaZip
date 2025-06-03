package textbook.Week06;

import java.util.HashMap;
import java.util.Map;

public class Week06_p465_06 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        // new로 객체를 생성하지 않음 -> CarFactory 클래스 안에 정적(static) 메서드 사용
        // 동일한 이름의 객체를 생성하였을 때 같은 주소가 나와야 한다. (true)
        // 싱글톤과 HashMap을 통해 해당 문제 풀이

        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        System.out.println(sonata1 == sonata2); // true

        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1 == avante2); // true

        System.out.println(sonata1 == avante1); // false
    }
}

class Car {
    String name;

    public Car() {}

    public Car(String name) {
        this.name = name;
    }
}

class CarFactory {
    // 1. 자기 자신을 private static으로 하나 생성해놓음 (딱 1개만)
    private static CarFactory instance = new CarFactory();

    // 2. 외부에서 생성 못하게 생성자 private로 막음
    private CarFactory() {}

    // 3. 대신 접근은 static 메서드로 할 수 있도록 함
    public static CarFactory getInstance() {
        return instance;
    }

    // 4. 공유할 자료구조
    private Map<String, Car> carMap = new HashMap<>();

    public Car createCar(String name) {
        if(carMap.containsKey(name)) // Key인 name이 carMap에 존재하는지 확인
            return carMap.get(name); // 있으면(true) Key가 name인 Car 객체를 반환함
        else { // name이라는 key가 존재하지 않으면
            Car car = new Car(name); // Car 객체 생성
            carMap.put(name, car); // HashMap 객체의 참조 변수인 carMap 인스턴스 객체에 저장
            return car; // 새로 만든 car 객체 반환
        }

    }
}