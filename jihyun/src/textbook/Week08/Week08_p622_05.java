package textbook.Week08;

public class Week08_p622_05 {
    public static Counter myCounter = new Counter(10);

    public static void main(String[] args) throws InterruptedException{
        Adder adder = new Adder();
        Substractor substractor = new Substractor();
        adder.start();
        substractor.start();

        Thread.sleep(3000); // Thread. 넣어야 함 (오류)
        System.out.println(myCounter.getNumber());
    }
}

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
    public void run() {
        synchronized (Week08_p622_05.myCounter) {
            int n = Week08_p622_05.myCounter.getNumber();
            n = n + 20;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Week08_p622_05.myCounter.setNumber(n);
            System.out.println(Week08_p622_05.myCounter.getNumber() + ":Adder");
        }
    }
}

class Substractor extends Thread {
    public void run() {
        synchronized (Week08_p622_05.myCounter) {
            int n = Week08_p622_05.myCounter.getNumber();

            n = n - 10;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Week08_p622_05.myCounter.setNumber(n);
            System.out.println(Week08_p622_05.myCounter.getNumber() + ":Substractor");
        }
    }
}
// public synchronized void run() 이렇게 걸면 스레드 객체 자체에만 lock을 걸기 때문에
// 둘 다 공유하고 있는 myCounter 객체는 보호받지 못함!