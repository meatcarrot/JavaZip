package textbook.Week06.collection.arraylist;

import java.util.ArrayList;

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data); // 스택의 맨 뒤에 요소를 추가
    }

    public String pop() {
        int len = arrayStack.size();

        if(len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return arrayStack.remove(len - 1);
        // ArrayList의 remove 메서드는 해당 값을 반환 후 삭제 진행
    }
}