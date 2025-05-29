package collection.arraylist;

import java.util.ArrayList;

class MyQueue<T> {
    private ArrayList<T> arrayQueue = new ArrayList<>();

    public void enQueue(T data) {
        arrayQueue.add(data);
    }

    public T deQueue() {
        int len = arrayQueue.size();

        if (len == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }

        return (arrayQueue.remove(0));
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
