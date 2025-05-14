package ch9;
import java.util.ArrayList;

abstract class Car {

    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void washCar()
    {
        System.out.println("세차를 합니다.");
    }

    public void run()
    {
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
class Avante extends Car {

    @Override
    public void start() {
        System.out.println("Avante 시동을 킴.");
    }

    @Override
    public void drive() {
        System.out.println("Avante 주행.");
    }

    @Override
    public void stop() {
        System.out.println("Avante 정지.");
    }

    @Override
    public void turnOff() {
        System.out.println("Avante 시동을 끔.");
    }

}
class Sonata extends Car {

    @Override
    public void start() {
        System.out.println("Sonata 시동을 켬.");
    }

    @Override
    public void drive() {
        System.out.println("Sonata 주행.");
    }

    @Override
    public void stop() {
        System.out.println("Sonata 정지.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sonata 시동을 끔.");
    }

}
public class week04_p319_05 {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Sonata());
        carList.add(new Avante());

        for(Car car : carList) {
            car.run();
            System.out.println();
        }
    }
}
