package Week02;

import java.util.Scanner;

public class Week02_p120_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력" );
        int n = scanner.nextInt();
        System.out.println("소수는");

        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
