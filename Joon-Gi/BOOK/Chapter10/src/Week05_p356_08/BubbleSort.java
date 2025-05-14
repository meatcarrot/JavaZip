package Week05_p356_08;

public class  BubbleSort implements Sort {
    @Override
    public void description() {
        Sort.super.description();
        System.out.println("버블 정렬입니다.");
    }

    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort Ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort Descending");
    }
}
