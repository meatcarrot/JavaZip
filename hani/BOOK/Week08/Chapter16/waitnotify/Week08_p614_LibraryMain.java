package waitnotify;

import java.util.ArrayList;

class Library {
    private ArrayList<String > shelf = new ArrayList<>();

    public Library(){
        shelf.add("태백 1");
        shelf.add("태백 2");
        shelf.add("태백 3");
        shelf.add("태백 4");
        shelf.add("태백 5");
        shelf.add("태백 6");
        shelf.add("태백 7");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        String book = shelf.remove(0);
        System.out.println(t.getName() + ":" + book+ " lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        System.out.println(t.getName() + ": "+ book + " return");
    }
}

class Student extends Thread {
    public void run() {
        try {
            String title = Week08_p614_LibraryMain.library.lendBook();
            Thread.sleep(5000);
            Week08_p614_LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Week08_p614_LibraryMain {
    public static Library library = new Library();

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
