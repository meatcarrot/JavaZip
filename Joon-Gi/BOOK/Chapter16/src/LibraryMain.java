import java.util.ArrayList;

class Library {
    private ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (shelf.size() == 0) {
            System.out.println(t.getName() + " 대기중");
            wait();
            System.out.println(t.getName() + " 대기 끝");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + ": " + book + " lend");
        return book;
    }

    public synchronized void returnBook(String book) throws InterruptedException {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return");
    }
}

class Student extends Thread {
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            Thread.sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {
    public static Library library = new Library();

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();

    }
}
