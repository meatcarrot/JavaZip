package textbook.Week08;

public class Week08_p596_Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        // Thread.currentThread() : 현재 실행 중인 스레드 객체

        MyThread thread1 = new MyThread();
        thread1.start(); // start()를 호출하여 run() 메서드 실행을 요청함 (비동기)
        // start()를 써야 스레드가 병렬로 실행됨. run() 직접 호출 시 메인스레드 안에서 실행

        MyThread thread2 = new MyThread();
        thread2.start(); // thread1과 병렬로 실행됨. (실행 순서 보장 안 됨)

        System.out.println("end");
        // 스레드들과 별개로, main 메서드는 이 줄까지 실행되고 종료함. end가 스레드들보다 먼저 출력될 수 있음
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int i;
        for (i=0; i<=10; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}

// start()와 run()의 차이
// thread.start() : 새로운 스레드가 만들어짐. 병렬처리 (동시 실행)
// thread.run() : 현재 스레드에서 함수 실행. 병렬x (직렬 실행)
// 만약 run()으로 thread1과 thread2를 실행시키면, 메인스레드 안에서 두 개가 순차적으로 실행됨.