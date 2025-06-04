package textbook.Week08;

import java.util.ArrayList;

public class Week08_p617_Library2 {
    public static Library2 library = new Library2() ;

    public static void main(String[] args) {
        Student2 std1 = new Student2();
        Student2 std2 = new Student2();
        Student2 std3 = new Student2();
        Student2 std4 = new Student2();
        Student2 std5 = new Student2();
        Student2 std6 = new Student2();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}

class Library2 {
    private ArrayList<String> shelf = new ArrayList<>();

    public Library2() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        if(shelf.size() == 0) {
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
        notify(); // 반납을 알림 -> 대기 상태에 있는 스레드 중 하나를 깨움
        System.out.println(t.getName() + ":" + book + " return");
    }
}

class Student2 extends Thread {
    public void run() {
        try {
            String title = Week08_p617_Library2.library.lendBook();
            Thread.sleep(5000);
            Week08_p617_Library2.library.returnBook(title);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
