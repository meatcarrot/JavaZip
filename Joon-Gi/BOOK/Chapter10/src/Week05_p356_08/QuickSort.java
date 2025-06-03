package Week05_p356_08;

public class QuickSort implements Sort {
    @Override
    public void description() {
        Sort.super.description();
        System.out.println("퀵 정렬입니다.");
    }

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort Ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort Descending");
    }
}
