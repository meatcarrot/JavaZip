package textbook.Week04;
import java.util.ArrayList;

public class Week04_p319_05 {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for (Car car : carList) {
            car.run();
            System.out.println("======================");
        }
    }
}

abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    public void washCar() {
        System.out.println("세차를 합니다.");
    }

    final public void run() {
        start();
        drive();
        stop();
        turnoff();
        washCar();
    }
}

class Sonata extends Car {
    public void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    public void drive() {
        System.out.println("Sonata 달립니다.");
    }

    public void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    public void turnoff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}

class Grandeur extends Car {
    public void start() {
        System.out.println("Grandeur 시동을 켭니다.");
    }

    public void drive() {
        System.out.println("Grandeur 달립니다.");
    }

    public void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    public void turnoff() {
        System.out.println("Grandeur 시동을 끕니다.");
    }
}

class Avante extends Car {
    public void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    public void drive() {
        System.out.println("Avante 달립니다.");
    }

    public void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    public void turnoff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}

class Genesis extends Car {
    public void start() {
        System.out.println("Genesis 시동을 켭니다.");
    }

    public void drive() {
        System.out.println("Genesis 달립니다.");
    }

    public void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    public void turnoff() {
        System.out.println("Genesis 시동을 끕니다.");
    }
}