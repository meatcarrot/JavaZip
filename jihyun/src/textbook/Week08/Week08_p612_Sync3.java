package textbook.Week08;

public class Week08_p612_Sync3 {
    public static Bank3 myBank = new Bank3();

    public static void main(String[] args) throws InterruptedException{
        Park3 p = new Park3();
        p.start(); // Park 스레드 시작
        Thread.sleep(200); // sleep 메서드로 0.2초간 main 스레드 동작을 멈춤

        ParkWife3 pw = new ParkWife3();
        pw.start(); // ParkWife 스레드 시작
    }
}

class Bank3 {
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int save) {
        int m = this.getMoney();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        setMoney(m + save);
    }

    public void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);
    }
}

class Park3 extends Thread {
    public void run() {
        synchronized (Week08_p612_Sync3.myBank) {
            // run() 메서드에 동기화 사용 시 괄호 안에 공유 객체 명시
            System.out.println("예금 작업을 시작합니다.");
            Week08_p612_Sync3.myBank.saveMoney(3000);
            System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 " + Week08_p612_Sync3.myBank.getMoney() + "입니다.");
            }
        }
}

class ParkWife3 extends Thread {
    public void run() {
        synchronized (Week08_p612_Sync3.myBank) {
            // run() 메서드에 동기화 사용 시 괄호 안에 공유 객체 명시
            System.out.println("출금 작업을 시작합니다.");
            Week08_p612_Sync3.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 " + Week08_p612_Sync3.myBank.getMoney() + "입니다.");
            }
        }
}