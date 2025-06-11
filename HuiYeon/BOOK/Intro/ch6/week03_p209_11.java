package ch6;

class Car {

    private static int serialNum = 10000;
    private int carNum;

    public Car(){
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum(){
        return carNum;
    }

    public void setCarNum(int carNum){
        this.carNum = carNum;
    }
}

class CarFactory{
    private static CarFactory instance = new CarFactory();

    private CarFactory(){};
    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    public Car createCar(){
        Car car = new Car();
        return car;
    }
}

public class week03_p209_11 {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());

    }
}
