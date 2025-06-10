package textbook.Week08;

public class Week08_p602_Interrupt extends Thread{
    public void run() {
        try{
            for(int i=1; i<=10; i++) {
                Thread.sleep(1000);
                System.out.print(i + "\t");
            }
        } catch(InterruptedException e) {
            System.out.println("wake up");
        }
        System.out.println("end");
    }

    public static void main(String[] args) throws InterruptedException {
        Week08_p602_Interrupt test = new Week08_p602_Interrupt();

       test.start();
       Thread.sleep(1000);
       test.interrupt(); // 출력하고나서 바로 interrupt 적용됨
    }
}
