import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        // 주사위 숫자들을 배열에 저장
        int[] dice = {a, b, c, d};
        
        // 주사위 나온 횟수 배열 (1~6)
        int[] count = new int[7]; // 0 빼고

        // 각 숫자의 개수 세기
        for (int num : dice) {
            count[num]++;
        }

        // 4개 같은 숫자
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }
        }

        // 3개 같은 숫자 + 1개 다른 숫자
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        return (int) Math.pow(10 * i + j, 2);
                    }
                }
            }
        }

        // 2개 + 2개 같은 숫자 (짝짝이)
        int p = 0, q = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                if (p == 0) p = i;
                else q = i;
            }
        }
        if (p != 0 && q != 0) {
            return (p + q) * Math.abs(p - q);
        }

        // 2개 같은 숫자 + 1개 다른 숫자 + 1개 다른 숫자 (p, q, r)
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                int x = 0, r = 0;
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        if (x == 0) x = j;
                        else r = j;
                    }
                }
                if (x != 0 && r != 0) {
                    return x * r;
                }
            }
        }

        // 모두 다를 때
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) {
                return i; // 가장 작은 수부터 탐색되므로 최소값 보장
            }
        }

        return 0;
    }
}
