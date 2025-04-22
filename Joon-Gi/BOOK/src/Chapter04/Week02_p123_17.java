package Chapter04;

import java.util.Scanner;

public class Week02_p123_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println("1부터 " + n + "사이의 소수는");
        for(int i = 2; i <= n; ++i) {
            boolean b = true;

            for(int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.print(i + " ");
            }
        }
        System.out.print("입니다.");
    }
}
