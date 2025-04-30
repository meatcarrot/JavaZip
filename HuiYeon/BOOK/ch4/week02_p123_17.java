package ch4;
import java.util.Scanner;
public class test17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {  // 제곱근까지만
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
