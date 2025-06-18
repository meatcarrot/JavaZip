package textbook.Week08;

import java.util.ArrayList;

public class Week08_p614_Library {
    public static Library library = new Library() ;

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student std5 = new Student();
        Student std6 = new Student();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}

class Library {
    private ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
        shelf.add("태백산맥 4");
        shelf.add("태백산맥 5");
        shelf.add("태백산맥 6");
        shelf.add("태백산맥 7");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        String book = shelf.remove(0);
        System.out.println(t.getName() + ":" + book + " lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread(); // 지금 실행 중인 스레드를 나타내는 객체를 반환
        shelf.add(book);
        System.out.println(t.getName() + ":" + book + " return");
    }
}

class Student extends Thread {
    public void run() {
        try {
            String title = Week08_p614_Library.library.lendBook();
            Thread.sleep(5000);
            Week08_p614_Library.library.returnBook(title);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
