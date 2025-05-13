package textbook.Week03;

public class Week03_p209_11 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}

class CarFactory { // 유일한 객체이므로 싱글톤 디자인패턴으로 구현
    private static CarFactory carNumber = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        return carNumber;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}

class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}