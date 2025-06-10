package textbook.Week08;

public class Week08_p604_Join {
    public static void main(String[] args) throws InterruptedException{
        // join() 메서드를 사용하려면 throws InterruptedException 예외처리를 추가

        JoinTest joinA = new JoinTest(1, 50);
        JoinTest joinB = new JoinTest(51, 100);

        joinA.start();
        joinB.start();

        joinA.join(); // main 스레드는 여기서 멈춰서 joinA가 끝날 때까지 기다림
        joinB.join(); // 그 다음 joinB가 끝날 때까지 또 기다림
        // join 메서드 : 다른 스레드가 끝날 때까지, 메인 스레드를 기다리게 만드는 메서드

        int total = joinA.sum + joinB.sum;
        System.out.println(joinA.sum + "+" + joinB.sum + "=" + total);
    }
}

class JoinTest extends Thread {
    int start;
    int end;
    int sum;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for(int i = start; i <= end; i++) {
            sum += i;
        }
    }
}