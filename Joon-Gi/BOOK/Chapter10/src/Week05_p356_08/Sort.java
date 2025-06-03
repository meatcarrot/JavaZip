package Week05_p356_08;

public interface Sort {
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }

    public void ascending(int[] arr);
    public void descending(int[] arr);
}
