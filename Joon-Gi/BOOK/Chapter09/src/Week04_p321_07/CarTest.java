package Week04_p321_07;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        autoCar.run();

        bus.refuel();
        autoCar.refuel();

        bus.takePassenger();
        autoCar.load();

        bus.stop();
        autoCar.stop();
    }
}
