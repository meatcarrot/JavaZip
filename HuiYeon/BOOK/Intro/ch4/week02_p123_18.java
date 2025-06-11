package ch4;

import java.util.Scanner;
import java.util.Scanner;
public class test18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        int n = scanner.nextInt();

        int result = 1;
        for (int i=2; i <= n; i++){
            result *= i;
        }
        System.out.println( n + "팩토리얼은" + result + "입니다");

    }
}
