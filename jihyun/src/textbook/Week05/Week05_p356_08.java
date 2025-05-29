package textbook.Week05;
import java.io.IOException;

public class Week05_p356_08 {
    public static void main(String[] args) throws IOException{
        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("B : BubbleSort ");
        System.out.println("H : HeapSort ");
        System.out.println("Q : QuickSort ");

        int ch = System.in.read();
        Sort sort = null;

        if(ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        }
        else if(ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        }
        else if(ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        // 정렬 방식과 상관없이 Sort에 선언된 메서드 호추
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}

interface Sort {
    public void ascending(int[] arr);
    public void descending(int[] arr);
    public void description();
}

class BubbleSort implements Sort {
    public void ascending(int[] arr) {
        System.out.println("오름차순으로 배열을 정렬합니다.");
    }

    public void descending(int[] arr) {
        System.out.println("내림차순으로 배열을 정렬합니다.");
    }

    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("BubbleSort를 진행합니다.");
    }
}

class HeapSort implements Sort {
    public void ascending(int[] arr) {
        System.out.println("오름차순으로 배열을 정렬합니다.");
    }

    public void descending(int[] arr) {
        System.out.println("내림차순으로 배열을 정렬합니다.");
    }

    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("HeapSort를 진행합니다.");
    }
}

class QuickSort implements Sort {
    public void ascending(int[] arr) {
        System.out.println("오름차순으로 배열을 정렬합니다.");
    }

    public void descending(int[] arr) {
        System.out.println("내림차순으로 배열을 정렬합니다.");
    }

    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("QuickSort를 진행합니다.");
    }
}