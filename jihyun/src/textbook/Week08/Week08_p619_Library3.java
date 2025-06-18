package textbook.Week08;

import java.util.ArrayList;

public class Week08_p619_Library3 {
    public static Library3 library = new Library3() ;

    public static void main(String[] args) {
        Student3 std1 = new Student3();
        Student3 std2 = new Student3();
        Student3 std3 = new Student3();
        Student3 std4 = new Student3();
        Student3 std5 = new Student3();
        Student3 std6 = new Student3();
        Student3 std7 = new Student3();
        Student3 std8 = new Student3();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        std7.start();
        std8.start();
    }
}

class Library3 {
    private ArrayList<String> shelf = new ArrayList<>();

    public Library3() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait(); // 책이 없는 경우 대기 상태가 됨
            System.out.println(t.getName() + " waiting end");
        }

        String book = shelf.remove(0);
        System.out.println(t.getName() + ":" + book + " lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread(); // 지금 실행 중인 스레드를 나타내는 객체를 반환
        shelf.add(book);
        notifyAll(); // 모든 스레드에게 알림이 통지됨 -> CPU를 차지하지 못한 스레드들이 경쟁함
        System.out.println(t.getName() + ":" + book + " return");
    }
}

class Student3 extends Thread {
    public void run() {
        try {
            String title = Week08_p619_Library3.library.lendBook();
            Thread.sleep(5000);
            Week08_p619_Library3.library.returnBook(title);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
