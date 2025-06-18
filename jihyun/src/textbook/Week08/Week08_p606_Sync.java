package textbook.Week08;

public class Week08_p606_Sync {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException{
        Park p = new Park();
        p.start(); // Park 스레드 시작
        Thread.sleep(200); // sleep 메서드로 0.2초간 main 스레드 동작을 멈춤

        ParkWife pw = new ParkWife();
        pw.start(); // ParkWife 스레드 시작
    }
}

class Bank {
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int save) {
        synchronized (this) {
            // 동기화 블록을 사용할 경우, 괄호 안에 공유 자원 명시
            int m = this.getMoney();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            setMoney(m + save);
        }
    }

    public void minusMoney(int minus) {
        synchronized (this) {
            // 동기화 블록을 사용할 경우, 괄호 안에 공유 자원 명시
            int m = this.getMoney();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(m - minus);
        }
    }
}

class Park extends Thread {
    public void run() {
        System.out.println("예금 작업을 시작합니다.");
        Week08_p606_Sync.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 " + Week08_p606_Sync.myBank.getMoney() + "입니다.");
    }
}

class ParkWife extends Thread {
    public void run() {
        System.out.println("출금 작업을 시작합니다.");
        Week08_p606_Sync.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 " + Week08_p606_Sync.myBank.getMoney() + "입니다.");
    }
}