package textbook.Week08;

public class Week08_p598_Runnable {
    public static void main(String[] args) {
        System.out.println("main start");

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        System.out.println("main end");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i =0; i<=5; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}