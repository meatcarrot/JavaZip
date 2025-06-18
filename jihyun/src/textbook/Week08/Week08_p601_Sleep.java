package textbook.Week08;

public class Week08_p601_Sleep extends Thread {
    public void run() {
        // run() 메서드는 start() 호출 시 자동으로 실행됨
        for (int i = 1; i<=10; i++) {
            try {
                Thread.sleep(1000); // 현재 스레드를 1초 동안 멈춤
                // sleep()은 interrupt 예외 발생할 수 있으므로,
                // 반드시 try-catch로 예외 처리해야 함
            } catch (InterruptedException e) {
                // catch가 없으므로 스레드 비정상 종료됨
                try {
                    throw new RuntimeException(e);
                } catch (RuntimeException ex) {
                    System.out.println("스레드 내부에서 RuntimeException 잡음: " + ex.getMessage());
                }
            }
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Week08_p601_Sleep test = new Week08_p601_Sleep();
        test.start(); // start()로 인해 새로운 스레드에서 run() 메서드 실행
        // 1초 간격으로 System.out.print(i + "\t"); 실행됨
        Thread.sleep(1001); // 메인 메서드의 스레드 1.001초 간격으로 쉼
        test.interrupt(); // test의 run 메서드 interrupt 발생(catch로 넘어감)
    }
}
