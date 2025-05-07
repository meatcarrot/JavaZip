package Week04_p322_08;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public abstract void wiper(); // 8번 문제

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
