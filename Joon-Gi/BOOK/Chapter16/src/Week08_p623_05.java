import static java.lang.Thread.sleep;

class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class Adder extends Thread {
    public synchronized void run() {
        synchronized (Week08_p623_05.myCounter) {
            int n = Week08_p623_05.myCounter.getNumber();
            n = n + 20;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Week08_p623_05.myCounter.setNumber(n);
            System.out.println(Week08_p623_05.myCounter.getNumber() + ":Adder");
        }
    }
}

class Subtractor extends Thread {
    public synchronized void run() {
        synchronized (Week08_p623_05.myCounter) {
            int n = Week08_p623_05.myCounter.getNumber();
            n = n - 10;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Week08_p623_05.myCounter.setNumber(n);
            System.out.println(Week08_p623_05.myCounter.getNumber() + ":Subtractor");
        }
    }
}

public class Week08_p623_05 {
    public static Counter myCounter = new Counter(10);

    public static void main(String[] args) throws InterruptedException {
        Adder adder = new Adder();
        Subtractor subtractor = new Subtractor();
        adder.start();
        subtractor.start();

        sleep(3000);
        System.out.println(myCounter.getNumber());
    }
}
