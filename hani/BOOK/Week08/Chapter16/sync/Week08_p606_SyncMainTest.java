package sync;

class Bank {
    private int money = 10000;

    public void saveMoney(int save) {
        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setMoney(m + save);
    }

    public void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {
    public void run() {
        System.out.println("예금 작업을 시작");
        Week08_p606_SyncMainTest.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 "+ Week08_p606_SyncMainTest.myBank.getMoney() + "입니다.");
    }
}

class ParkWife extends Thread {
    public void run() {
        System.out.println("출금 작업을 시작");
        Week08_p606_SyncMainTest.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 "+ Week08_p606_SyncMainTest.myBank.getMoney() + "입니다.");
    }
}

public class Week08_p606_SyncMainTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park p = new Park();
        p.start();

        Thread.sleep(200);
        ParkWife pw = new ParkWife();
        pw.start();
    }
}
