package textbook.Week08;

public class Week08_p609_Sync2 {
    public static Bank2 myBank = new Bank2();

    public static void main(String[] args) throws InterruptedException{
        Park2 p = new Park2();
        p.start(); // Park 스레드 시작
        Thread.sleep(200); // sleep 메서드로 0.2초간 main 스레드 동작을 멈춤

        ParkWife2 pw = new ParkWife2();
        pw.start(); // ParkWife 스레드 시작
    }
}

class Bank2 {
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void saveMoney(int save) {
        // 공유자원 동기화하는 lock 예약어 사용 (synchronized)
        int m = this.getMoney();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        setMoney(m + save);
    }

    public synchronized void minusMoney(int minus) {
        // 공유자원 동기화하는 lock 예약어 사용 (synchronized)
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);
    }
}

class Park2 extends Thread {
    public void run() {
        System.out.println("예금 작업을 시작합니다.");
        Week08_p609_Sync2.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 " + Week08_p609_Sync2.myBank.getMoney() + "입니다.");
    }
}

class ParkWife2 extends Thread {
    public void run() {
        System.out.println("출금 작업을 시작합니다.");
        Week08_p609_Sync2.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 " + Week08_p609_Sync2.myBank.getMoney() + "입니다.");
    }
}