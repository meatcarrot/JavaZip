package textbook.Week09;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_직각삼각형_P4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a == 0 && b == 0 && c == 0) break;

            int[] arr = {a, b, c};
            Arrays.sort(arr);

            if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2]))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
