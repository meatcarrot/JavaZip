package textbook.Week09.Chapter3_자료구조;

// 시간복잡도 O(n^2)이기 때문에 투 포인터(슬라이딩 윈도우)로 구현

import java.util.Scanner;

public class _006_연속된_자연수의_합_구하기_P2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 1; // n인 경우 기본 한개
        int start_idx = 1; // 배열을 따로 만들지 않고, start_idx와 end_idx로 구현
        int end_idx = 1;
        int sum = 1; // 시작 값

        while(end_idx != n) {
            if(sum == n) {
                count++;
                end_idx++;
                sum += end_idx;
            } else if(sum > n) {
                sum -= start_idx;
                start_idx++;
            } else { // sum < n인 경우
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.println(count);
    }
}
