package ch16;
import static java.lang.Thread.sleep;

class Counter {
    private int number;

    public Counter(int number){
        this.number = number;
    }

    public  int getNumber(){
        return number;
    }

    public  void setNumber(int number){
        this.number = number;
    }
}
class Adder extends Thread{

    public void run(){
        synchronized (week07_p623_05.myCounter) {
            int n = week07_p623_05.myCounter.getNumber();
            n = n + 20;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            week07_p623_05.myCounter.setNumber(n);
            System.out.println(week07_p623_05.myCounter.getNumber() + ":Adder");
        }
    }

}

class Substractor extends Thread{
    public void run(){
        synchronized (week07_p623_05.myCounter) {
            int n = week07_p623_05.myCounter.getNumber();
            n = n - 10;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            week07_p623_05.myCounter.setNumber(n);
            System.out.println(week07_p623_05.myCounter.getNumber() + ":Substractor");
        }
    }
}
public class week07_p623_05 {
    public static Counter myCounter = new Counter(10);

    public static void main(String[] args) throws InterruptedException {
        Adder adder = new Adder();
        Substractor substractor = new Substractor();
        adder.start();
        substractor.start();

        sleep(3000);
        System.out.println(myCounter.getNumber());

    }
}
