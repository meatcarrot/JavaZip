package textbook.Week09.Chapter3_자료구조;

import java.util.Scanner;

// 문제 -> 배열의 크기 최대 10만개, 구간합 계산 최대 10만개 -> 최악의 경우 100억 회 연산
// 보통 1초 당 1억 회 연산을 수행하므로, 시간 제한 0.5초인 경우 매번 직접 구간합 계산 불가능
// 누적합을 사용하면 구간 합 배열은 최대 10만 번 계산 수행, 이후 구간 합 계산 한번 O(1) 수행 (최대 10만번)
// 총 10만 번 + 10만 번 계산 총 20만 계산

public class _003_1_구간_합_구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int line = scanner.nextInt();

        int[] array = new int[number];
        int[] array_sum = new int[number];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if(i == 0) array_sum[i] = array[i];
            else {
                array_sum[i] = array_sum[i - 1] + array[i];
            }
        }

        int a, b, value1, value2;
        for(int j= 0; j < line; j++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            value1 = (a - 2 < 0) ? 0 : array_sum[a - 2];
            value2 = (b - 1 < 0) ? 0 : array_sum[b - 1];

            System.out.println(value2 - value1);
        }
    }
}
// 걸린 시간 1864ms