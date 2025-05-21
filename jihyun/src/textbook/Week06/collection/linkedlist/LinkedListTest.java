package textbook.Week06.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);

        myList.add(1, "D"); // 두 번째 위치에 D 추가
        System.out.println(myList);

        myList.addFirst("0");
        System.out.println(myList);

        System.out.println(myList.removeLast()); // 마지막 요소 삭제
        System.out.println(myList);
    }
}
