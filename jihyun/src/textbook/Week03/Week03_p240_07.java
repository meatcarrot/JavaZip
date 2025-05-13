package textbook.Week03;

public class Week03_p240_07 {
    public static void main(String[] args) {
        int sum = 0; // 모든 요소 합 계산
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i : num) sum += i;

        System.out.println("총 합: " + sum);
    }
}
