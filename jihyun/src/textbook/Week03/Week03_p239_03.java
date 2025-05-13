package textbook.Week03;

public class Week03_p239_03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int j = 0;

        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) continue;
            else {
                arr[j] = i;
                j++;
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
