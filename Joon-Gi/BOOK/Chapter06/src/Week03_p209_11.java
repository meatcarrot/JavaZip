// 유일한 객체
class CarFactory {
    private static CarFactory instance = new CarFactory();
    private CarFactory() { }

    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car temp = new Car();

        return temp;
    }
}

class Car {
    private static int serialNumber = 10000;
    private int carNumber;

    public Car() {
        serialNumber++;
        this.carNumber = serialNumber;
    }

    public int getCarNum() {
        return carNumber;
    }

}

public class Week03_p209_11 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();

        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
