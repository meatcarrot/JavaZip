package Week05_p356_08;

public class HeapSort implements Sort {
    @Override
    public void description() {
        Sort.super.description();
        System.out.println("힙 정렬입니다.");
    }

    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort Ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort Descending");
    }
}
